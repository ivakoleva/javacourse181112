package com.musala.javacourse181112.FirstPartJava.tasks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class FileExercise {
    public static void main(final String[] args) throws IOException {
        //doCreation();
        doDeleteOnExit();
    }

    private static void doCreation() throws IOException {
        final File file = new File("sampleDir");
        System.out.println("file exists: " + file.exists());

        if (!file.mkdir()) {
            System.out.println("cannot make dir, exiting...");
            System.exit(1);
        }

        System.out.println("file1 created: " +
                new File(file, "file1").createNewFile());
        System.out.println("file1 created: " +
                new File(file, "file2").createNewFile());
    }

    private static void doDeleteOnExit() throws IOException {
        final File file = new File("deleteOnExitFile.txt");
        file.createNewFile();
        file.deleteOnExit();
        final String parent = file.getAbsoluteFile().getParent();
        if(parent == null) {
            System.out.println("parent null, exiting");
            System.exit(1);
        }
        final File parentFile = new File(parent);
        final String[] parentFileList = parentFile.list();
        if(parentFileList == null) {
            System.out.println("parent list null, exiting");
            System.exit(1);
        }

        final Optional<String> filenameOptional = Arrays.stream(parentFile.list())
                .filter(filename -> filename.equals("deleteOnExitFile.txt"))
                .findAny();
        System.out.println("filename listed: " + filenameOptional.isPresent());
        System.exit(0);
    }
}
