package com.musala.javacourse181112.FirstPartJava.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class InputStreamReaderExample {
    //InputStream inputStream;

    public static void main(final String[] args) {
        // old-fashion way
        Reader reader = null;
        try {
            // InputStream to Reader bridge
            reader = new InputStreamReader(
                    new FileInputStream("non_default_encoding_file.txt"),
                    Charset.forName("Windows-1251"));
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }

        // try-with-resources
        try (final InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("non_default_encoding_file.txt"),
                Charset.forName("Windows-1251"));
             //OutputStream outputStream = new FileOutputStream("asd");
        ) {
            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
