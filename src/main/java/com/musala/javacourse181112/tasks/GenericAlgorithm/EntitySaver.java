package com.musala.javacourse181112.tasks.GenericAlgorithm;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class EntitySaver {

    private final Set<Entity> ENTITY_SET;

    public EntitySaver() {
        this.ENTITY_SET = new HashSet<>();
    }


    public <T extends Entity> void entitySaver(final T entity) throws IOException {
        this.ENTITY_SET.clear();
        Path path = Paths.get("src" + File.separator + "PawIncorporated" + File.separator + "resources" + File.separator + "GenericAlgorithm");
        path.toFile().mkdirs();

        path = Paths.get(path.toString() +
                File.separator + entity.getClass().getSimpleName() +
                "_" + entity.toString() + ".txt");

        this.saveEntity(new PrintWriter(path.toFile()), entity);

        for (Entity setEntity : this.ENTITY_SET) {
            setEntity.setPersisted(false);
        }
        this.ENTITY_SET.clear();
    }

    public <T extends Entity> void saveEntity(final PrintWriter printWriter, final T entity) throws IOException {
        assert entity != null;
        assert printWriter != null;

        if (!this.ENTITY_SET.contains(entity) || this.ENTITY_SET.isEmpty()) {
            this.ENTITY_SET.add(entity);
            entity.setPersisted(true);
        }

        final Field[] fields = entity.getClass().getDeclaredFields();
        final Map<String, Object> fieldNameValueMap = Arrays.stream(fields)
                .peek(field -> field.setAccessible(true))
                .filter(field -> {
                    try {
                        return field.get(entity) != null && !field.getName().equals("persisted");
                    } catch (IllegalAccessException | NullPointerException ignore) {
                        return false;
                    }
                }).collect(Collectors.toMap(
                        Field::getName,
                        field -> {
                            try {
                                return field.get(entity);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                                return null;
                            }
                        })
                );

        try {
            for (final Map.Entry<String, Object> fieldNameValueEntry : fieldNameValueMap.entrySet()) {
                if (!isEntity(fieldNameValueEntry.getValue().getClass())) {
                    if (isIterable(fieldNameValueEntry.getValue().getClass())) {
                        printWriter.write(System.lineSeparator() + fieldNameValueEntry.getKey() + "=");

                        entitiesSaver(printWriter, (Iterable) fieldNameValueEntry.getValue());
                    } else {
                        printWriter.write(System.lineSeparator() + fieldNameValueEntry.getKey() + "=" + fieldNameValueEntry.getValue().toString());
                    }
                } else {
                    final Entity e = (Entity) fieldNameValueEntry.getValue();
                    if (!e.isPersisted()) {
                        printWriter.write(System.lineSeparator() + fieldNameValueEntry.getValue().getClass().getSimpleName() + "=" + ((Entity) fieldNameValueEntry.getValue()).getID());
                    } else {
                        printWriter.write(fieldNameValueEntry.getKey() + "=" + fieldNameValueEntry.getValue().toString());
                    }
                }
            }

        } finally {
            printWriter.close();
        }
    }

    public <T extends Entity> void entitiesSaver(final PrintWriter printWriter, final Iterable<T> entities) throws IOException {
        Iterator<T> collectionIterator = entities.iterator();
        while (collectionIterator.hasNext()) {
            Entity entity = collectionIterator.next();

            printWriter.write(entity.getClass().getSimpleName() + "=" + entity.getID() + ",");

        }
    }

    public <T> boolean isEntity(final Class<T> clazz) { // T instance
        return Entity.class.isAssignableFrom(clazz);
    }

    public <T> boolean isIterable(final Class<T> clazz) {
        return Iterable.class.isAssignableFrom(clazz);
    }

}
