package com.musala.javacourse181112.tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {

    private static final int OFFSET = 3;
    private static final int BUFFER_SIZE = 1027;
    private static final int END_OF_FILE = -1;

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
        final byte[] buffer = new byte[BUFFER_SIZE];
        buffer[0] = (byte) 'a';
        buffer[1] = (byte) 'b';
        buffer[2] = (byte) 'c';

        // buffer length should be lower or equal to the offset
        while ((i = inputStream.read(buffer, OFFSET, buffer.length-OFFSET)) != END_OF_FILE) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()

        }
        // proof
        System.out.println("\nPROOF: ");
        System.out.println((char)buffer[0]);
        System.out.println((char)buffer[1]);
        System.out.println((char)buffer[2]);

        // TODO: implement inputStream.read(buffer, offset, length)
        // TODO: have in mind the Important note above


        // we are required to close, always do remember pls
        inputStream.close();
    }
}
