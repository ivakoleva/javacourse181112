package com.musala.javacourse181112.tasks;

import java.io.*;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {
    public static void main(final String[] args) throws IOException {

        final InputStream inputStream = new FileInputStream("sketch.txt");
        final OutputStream outputStream = new FileOutputStream("tasks_copy.txt");
        int i;
        /*while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }*/

        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         */
        /*final byte[] buffer = new byte[1027];
        final int offset = 200;
        final int lenght = 400;

        while ((i = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()
        }*/

        i = inputStream.read();
        outputStream.write(i);
        // we are required to close, always do remember pls
        inputStream.close();
    }
}
