package com.musala.javacourse181112.FirstPartJava.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class StringToStreamExample {
    public static void main(final String[] args) {
        printReaderToStdout(new StringReader("asd"));
        //StringWriter
        //CharArrayReader
        //CharArrayWriter
        //final byte[] data = {'a', 'b', 'c'};
        printInputStreamToStdout(new ByteArrayInputStream("asd".getBytes())); // data
        //ByteArrayOutputStream
    }

    public static void printReaderToStdout(final Reader reader) {
        // TODO
    }

    public static void printInputStreamToStdout(final InputStream inputStream) {
        // TODO
    }
}
