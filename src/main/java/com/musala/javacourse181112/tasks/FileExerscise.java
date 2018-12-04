package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;

public class FileExerscise {
    public static void main(final String[] args) throws IOException {
        final File file = new File("src", "test");
        file.createNewFile();
        System.out.println("File: " + file.exists());
        if (!file.mkdir()) {
            System.out.println("");
        }
        final File file1 = new File(file, "file1");
        final File file2 = new File(file, "file2");
    }
}
