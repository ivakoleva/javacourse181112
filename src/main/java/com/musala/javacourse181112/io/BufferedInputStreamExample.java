package com.musala.javacourse181112.io;

import java.io.*;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (final InputStream inputStream = new BufferedInputStream(new FileInputStream("tasks.md"), 128);
             final OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("bufferOutputFile.md"),128)
        ) {
            //printInputStreamToStdout(inputStream);
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
                outputStream.write((char) i);
            }
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
