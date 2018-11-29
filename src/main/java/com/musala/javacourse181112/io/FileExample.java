package com.musala.javacourse181112.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Iva Koleva on 29.11.2018
 */
public class FileExample {
    public static void main(final String[] args) throws IOException {
        final File file = new File("src", "test");
        System.out.println("exists: " + file.exists());
        System.out.println();

        if(file.createNewFile()) {
            try (final Writer writer = new FileWriter(file)) {
                writer.write("asd");
                writer.write("asdf");
            }
        }
    }
}
