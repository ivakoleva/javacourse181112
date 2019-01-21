package com.musala.javacourse181112.classworks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        createFile();
//        myDeleteOnExit();

    }

    public static void createFile() {
        final File file = new File("newFileDirectory");
        if (file.exists()) {
            System.out.println("This file exists!");
        }

        if (!file.mkdir()) {
            System.out.println("Couldn't make directory");
            System.exit(1);
        }
        try {
            System.out.println("FileOne created : " + new File(file, "FileOne").createNewFile());
            System.out.println("FileTwo created : " + new File(file, "FileTwo").createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void myDeleteOnExit() throws IOException {
        final File file = new File("deletesOnExitFile");
        file.createNewFile();
        file.deleteOnExit();

        final String parentPath = file.getAbsoluteFile().getParent();
        if (parentPath == null) {
            System.out.println("Path name is null");
            System.exit(1);

        }

        final File parentFile = new File(parentPath);
        final String[] parentListArray = parentFile.list();
        if (parentListArray == null){
            System.out.println("Parent list is null");
            System.exit(1);

        }

        final Optional<String> fileNameOptional = Arrays.stream(parentFile.list())
                                            .filter(filename -> filename.equals("deletesOnExitFile"))
                                            .findAny();
        System.out.println("Filename: " + fileNameOptional.isPresent());
        System.exit(0);

    }
}
