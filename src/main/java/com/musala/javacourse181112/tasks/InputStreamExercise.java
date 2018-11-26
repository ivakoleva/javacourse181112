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
         */
        //final byte[] buffer = new byte[1027];

        int i;
        while ((i = inputStream.read()) != -1) {
            outputStream.write(i);
        }
        inputStream.close();
        outputStream.close();
    }
}
