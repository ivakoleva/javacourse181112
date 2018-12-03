package com.musala.javacourse181112.MyStuff;

import java.io.*;
import java.nio.charset.Charset;

/*
* ** FileOutputStream exercise *** using FileOutputStream,
* bridge to Writer then write some content *** content encoding
* - Windows-1251 *** add buffering (Buffered*)
* todo: try-catch method thing
* */
public class FileOutputStreamExercise {
    public static void main(String[] args) throws IOException {
        final Writer writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("tasks_copy.md"), Charset.forName("Windows-1251")), 128);
        writer.write(System.lineSeparator()+"това е на бълагски лол");
        writer.close();
    }
}
