package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExercise {
    public static void main(String[] args) throws IOException {
        final FileReader reader = new FileReader("tasks.md");
        final char[] buffer = new char[1024];

        int i;
        while ((i = reader.read(buffer)) != -1) {
            System.out.println(buffer);
        }

    }

}
