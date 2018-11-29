package com.musala.javacourse181112.io;

import java.io.File;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class FileExample {
    public static void main(final String[] args) {
        final File file = new File("src", "test");
        System.out.println("exists: " + file.exists());
        System.out.println();
    }
}
