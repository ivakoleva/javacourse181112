package com.musala.javacourse181112.tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {
    private static final int SYSTEM_RESERVED_SYMBOLS = 3;

    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");
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

        System.out.println(buffer+"\n");

        while ((i = inputStream.read(buffer,SYSTEM_RESERVED_SYMBOLS,buffer.length-SYSTEM_RESERVED_SYMBOLS)) != -1) {
            System.out.print(new String(buffer, SYSTEM_RESERVED_SYMBOLS, i-SYSTEM_RESERVED_SYMBOLS));
        }

        // proof
        System.out.println();
        System.out.println((char) buffer[0]);
        System.out.println((char) buffer[1]);
        System.out.println((char) buffer[2]);

        // we are required to close, always do remember pls
        inputStream.close();
    }
}
