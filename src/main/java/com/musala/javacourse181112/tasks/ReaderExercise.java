package com.musala.javacourse181112.tasks;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExercise {
    public static void main(final String[] args) throws IOException {

        final char[] buffer = new char[1024];
        final Reader reader = new FileReader("tasks.md");
        int i;

        while ((i = reader.read(buffer)) != -1) {
            // test & fix
            System.out.print(new String(buffer,0,i));
        }

        reader.close();
    }
}
