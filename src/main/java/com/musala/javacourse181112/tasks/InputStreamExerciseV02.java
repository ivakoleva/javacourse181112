package com.musala.javacourse181112.tasks;

import java.io.*;

public class InputStreamExerciseV02 {
    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");
        final OutputStream outputStream = new FileOutputStream("tasks_copy.txt");


        /*while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }*/

        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         */

        final byte[] buffer = new byte[1027];
        buffer[0] = (byte) 'a';
        buffer[1] = (byte) 'b';
        buffer[2] = (byte) 'c';

        int i;
            /*
            while ((i = inputStream.read(buffer, 3, buffer.length - 3)) != -1) {
                // print to stdout
                System.out.print(new String(buffer, 3, i)); // , Charset.defaultCharset()
            }
            */


        // TODO: implement inputStream.read(buffer, offset, length)
        // TODO: have in mind the Important note above


        // proof
        System.out.println((char) buffer[0]);
        System.out.println((char) buffer[1]);
        System.out.println((char) buffer[2]);

        while ((i = inputStream.read()) != -1) {
            outputStream.write(i);
        }

        // we are required to close, always do remember pls
        inputStream.close();
        outputStream.close();
    }


}
