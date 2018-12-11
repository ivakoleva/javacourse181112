package com.musala.javacourse181112.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputStreamExample {
    public static void main(final String[] args) throws IOException {
//        Input stream/ output stream  ,
//        reader/writer


        final InputStream inputStream = new FileInputStream("sketch.txt");
        int i;
        /*while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }*/
        final byte[] buffer = new byte[1024];
        while ((i = inputStream.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i)); // , Charset.defaultCharset()
        }

        // we are required to close, always do remember pls
        inputStream.close();
    }
}