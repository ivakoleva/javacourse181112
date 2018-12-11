package com.musala.javacourse181112.tasks;

import java.io.*;

import java.nio.charset.Charset;

public class OutputStreamWriterExercise {
    public static final Charset CHARSET = Charset.forName("Windows-1251");

    public static void main(String[] args) {
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("non_default_encoding_file.txt"), CHARSET));
             final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("writtenFile.txt"), CHARSET))
        ) {
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.println((char) i);
                bufferedWriter.write((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
