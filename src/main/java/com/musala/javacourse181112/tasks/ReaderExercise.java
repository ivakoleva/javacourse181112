package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExercise {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("task.md");
        int data = reader.read();
        while (data != -1) {
            char dataChar = (char) data;
            data = reader.read();


        }

    }
}
