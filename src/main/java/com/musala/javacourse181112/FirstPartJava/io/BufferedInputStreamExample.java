package com.musala.javacourse181112.FirstPartJava.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (final InputStream inputStream = new BufferedInputStream(new FileInputStream("tasks.md"), 128)) {
            printInputStreamToStdout(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printInputStreamToStdout(final InputStream inputStream) throws IOException {
        int i;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
