package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class OutputStreamWriterExercise {
    public static void main(final String[] args) {

        try(final Writer writer=new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("test1.txt"),Charset.forName("Windows-1251")),128)
        ) {
            writer.write("Проба/Грешка");

        } catch (IOException ignored) {

        }


    }

}