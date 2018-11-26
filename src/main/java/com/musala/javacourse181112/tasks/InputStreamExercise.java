package com.musala.javacourse181112.tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {
    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");

        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         */
        final byte[] buffer = new byte[1027];

        int i;
        while ((i = inputStream.read(buffer, 3, buffer.length - 3)) != -1) {
            // print to stdout
            System.out.print(new String(buffer, 3, i)); // , Charset.defaultCharset()

            // write to file
            // TODO: do write to a previously instantiated fileOutputStream as well
        }

        // we are required to close, always do remember pls
        inputStream.close();
    }
}
