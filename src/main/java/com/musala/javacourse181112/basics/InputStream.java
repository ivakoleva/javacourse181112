package com.musala.javacourse181112.basics;

import java.io.FileInputStream;
import java.nio.charset.Charset;

public class InputStream {
    public static void main(final String[] args){
        final InputStream  inputStream = new FileInputStream("sketch.txt");

        int i;
        /*while((i = inputStream.read() ) !=-1){
            System.out.println((char) i);
        }*/
        final byte[] buffer = new byte[1024];
        while((i = inputStream.read(buffer)) 1= -1){
            System.out.println((char)i);
            System.out.print(new String(buffer,0,i); //Charset.defaultCharset());
        }
    }
    inputStream.close(); // we are required to close, always
}
