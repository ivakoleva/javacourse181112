package com.musala.javacourse181112.tasks;

import java.io.*;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class InputStreamExercise {

    private static final int SYSTEM_RESERVED_BYTES = 3;

    public static void main(final String[] args) throws IOException {
        // TODO: try-catch later. ! It is really important, to do try-catch.

        final InputStream inputStream = new FileInputStream("sketch.txt");
        final OutputStream outputStream = new FileOutputStream("tasks_copy.md");
        int i;

        /*while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }*/

        /**
         * Important note: first 3 bytes are system-reserved, please do not overwrite
         */
        final byte[] buffer = new byte[1027];

        /*while ((i = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()
        }*/

        // TODO: implement inputStream.read(buffer, offset, length)
        // TODO: have in mind the Important note above

        while ((i = inputStream.read(buffer, SYSTEM_RESERVED_BYTES, buffer.length - SYSTEM_RESERVED_BYTES)) != -1) {
            System.out.print(new String(buffer, SYSTEM_RESERVED_BYTES, i - SYSTEM_RESERVED_BYTES));
            outputStream.write(buffer, SYSTEM_RESERVED_BYTES, i - SYSTEM_RESERVED_BYTES);
            //
        }
        inputStream.close();
        outputStream.close();

        // we are required to close, always do remember pls

    }
}
