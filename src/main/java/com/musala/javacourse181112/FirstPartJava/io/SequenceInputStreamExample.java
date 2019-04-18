package com.musala.javacourse181112.FirstPartJava.io;

import java.io.*;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class SequenceInputStreamExample {
    public static void main(final String[] args) {
        try (final InputStream inputStream =
                     new BufferedInputStream(
                             new SequenceInputStream(
                                     new FileInputStream("sketch.txt"),
                                     new FileInputStream("tasks.md")
                             ))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
