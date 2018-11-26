package com.musala.javacourse181112.tasks;

import java.io.*;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {
    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");
        final OutputStream outputStream = new FileOutputStream("task_copy.md");
        int i;

        while ((i = inputStream.read()) != -1) {
           outputStream.write(i);

        }


        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         */
        /*final byte[] buffer = new byte[1027];
        buffer[0] = (byte) 'a';
        buffer[1] = (byte) 'b';
        buffer[2] = (byte) 'c';

        /*while ((i = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()
        }*/

        // TODO: implement inputStream.read(buffer, offset, length)
        // TODO: have in mind the Important note above


        // proof
        /*System.out.println((char) buffer[0]);
        System.out.println((char) buffer[1]);
        System.out.println((char) buffer[2]);*/

        // we are required to close, always do remember pls
        inputStream.close();
        outputStream.close();
    }
}
