package com.musala.javacourse181112.io;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

public class StringToStreamExample {
    public static void main(String[] args) {
        printReaderToStdout(new StringReader("asd"));




        printInputStreamToStdout(new ByteArrayInputStream("asd".getBytes())); //data

    }

    public static void printReaderToStdout(final Reader reader){

        // TODO: 26.11.2018 г.
    }
    public static void printInputStreamToStdout(final InputStream inputStream){
        // TODO: 26.11.2018 г.
    }
}

