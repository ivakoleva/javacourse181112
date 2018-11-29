package com.musala.javacourse181112.io;

import java.io.*;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class BufferedInputStreamExample {
    public static void main(final String[] args) {
        try (final InputStream inputStream = new BufferedInputStream(new FileInputStream("tasks.md"), 128);
             final OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("bufferOutputFile.md"), 128)
        ) {
            //printInputStreamToStdout(inputStream);
            printInputStreamToStdout(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method overloading example
    public static void printInputStreamToStdout(final InputStream inputStream,
                                                final OutputStream outputStream) throws IOException {
        int i;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
            if (outputStream != null) {
                outputStream.write((char) i);
            }
        }
    }

    public static void printInputStreamToStdout(final InputStream inputStream) throws IOException {
        printInputStreamToStdout(inputStream, null);
    }
}
