package com.musala.javacourse181112.tasks.GenericAlgorithm;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EntityPopulator {
    private Path PATH;
    private boolean isPathToDir;
    private Map<Class, List<Entity>> entityMap;

    public EntityPopulator(Path path) {
        this.PATH = path;
        if (path.toString().contains(".")) {
            isPathToDir = false;
        } else {
            isPathToDir = true;
        }
    }

    public void populateEntities() throws IOException {
        if (!isPathToDir) {
            //  populateEntity();
        } else {
            List<Path> result = new ArrayList<>();
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(PATH, "*.{txt}")) {
                for (Path entry : stream) {
                    result.add(entry);
                }
            } catch (DirectoryIteratorException ex) {
                // I/O error encounted during the iteration, the cause is an IOException
                throw ex.getCause();
            }
        }
    }

    private <T extends Entity> Class<T> toClass(String className) {
        Class clazz;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            return null;
        }
        if (Entity.class.isAssignableFrom(clazz)) {
            return clazz;
        } else {
            return null;
        }
    }

    private <T extends Entity> T populateEntity(final Path path) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //assert entityClass != null;
        assert path != null;

        Class<T> entityClass = toClass(path.toString().substring(path.toString().lastIndexOf(File.separator) + 1));
        assert entityClass != null;

        // parse file
        final Map<String, String> map = Files.readAllLines(path).stream()
                .filter(line -> {
                    final int i = line.indexOf("=") + 1;
                    return i > 1 && i < line.length();
                })
                .collect(Collectors.toMap(
                        line -> line.substring(0, line.indexOf("=")),
                        line -> line.substring(line.indexOf("=") + 1)
                ));

        final T entity = entityClass.getDeclaredConstructor().newInstance();

        final Field[] fields = entityClass.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> map.keySet().contains(field.getName()))
                .peek(field -> field.setAccessible(true))
                .forEach(field -> {
                    try {
                        field.set(entity, this.parseValueFromString(field.getType(), map.get(field.getName())));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });

        return entity;
    }

    public <T> T parseValueFromString(final Class<T> clazz, final String value) {
        if (String.class.equals(clazz)) {
            return (T) value;
        } else if (Integer.class.equals(clazz)) {
            return (T) Integer.valueOf(value);
        }
        throw new UnsupportedOperationException();
    }

}
