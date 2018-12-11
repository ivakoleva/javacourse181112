package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamExercise {
    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("tasks.md");
        final OutputStream outputStream = new FileOutputStream("tasks_copy.md");
        int i;
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
        /*while ((i = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()
        }*/
        System.out.println((char) buffer[0]);
        System.out.println((char) buffer[1]);
        System.out.println((char) buffer[2]);


//        while ((i = inputStream.read(buffer, 3, buffer.length - 3)) != -1) {
//            System.out.println(new String(buffer, 3, i));
//        }


        System.out.println("\n" + (char) buffer[0] + "\n" + (char) buffer[1] + "\n" + (char) buffer[2]);
        //TODO : Write to a previously instanced fileOutputStream as well



        while ((i = inputStream.read()) != -1) {
            outputStream.write(i);
        }

        // we are required to close, always do remember pls
        outputStream.close();
        inputStream.close();
    }
}