package com.musala.javacourse181112;

import java.io.FileReader;

public class ReaderExercise {
    public static void main(final String[] args) {
        final FileReader fileReader = new FileReader("tasks.md");
        final char[] buffer = new char[1024];
        int i;

        while((i = fileReader.read(buffer)) != -1) {
            System.out.println(new String(buffer,0,i));
        }

        fileReader.close();

    }
}
