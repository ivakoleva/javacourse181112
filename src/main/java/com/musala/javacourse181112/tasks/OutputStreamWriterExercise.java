package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class OutputStreamWriterExercise {
    public static  void main(final String[] args) {
        try (final InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("non_default_encoding_file.txt"),Charset.forName("Windows-1251"));
             final OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream("fileWriter.txt")
                     ,Charset.forName("Windows-1251"));
             final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             final BufferedWriter bufferedWriter = new BufferedWriter(outputStream);
        ) {
            int i = 0;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
                outputStream.write((char) i);
            }
            /*while ((i = bufferedReader.read()) != -1){
                System.out.print((char)i);
                bufferedWriter.write((char)i);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
