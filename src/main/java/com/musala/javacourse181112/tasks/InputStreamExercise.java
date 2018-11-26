package com.musala.javacourse181112.tasks;

import java.io.*;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {
    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");
        final OutputStream outputStream = new FileOutputStream("tasks_copy.md");

        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         *
         *  InputStream exercise v0.2
         *     ** after reading the file, do store file content to tasks_copy.md
         *     (to a new file, using FileOutputStream)
         */
        final byte[] buffer = new byte[1027];
        buffer[0] = (byte) 'a';
        buffer[1] = (byte) 'b';
        buffer[2] = (byte) 'c';

        int i, o;
        while ((i = inputStream.read(buffer, 3, buffer.length - 3)) != -1) {
            // print to stdout
            System.out.print(new String(buffer, 3, i)); // , Charset.defaultCharset()
            outputStream.write(buffer,3,buffer.length -3);
            // write to file
            // TODO: do write to a previously instantiated fileOutputStream as well
        }
        // proof
        System.out.println((char) buffer[0]);
        System.out.println((char) buffer[1]);
        System.out.println((char) buffer[2]);

        // we are required to close, always do remember pls
        inputStream.close();
    }
}
