package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExercise {
    // read characters from tasks.md, using FileReader
    //write to stdout, optimize

    public static void main(String[] args) throws IOException {
        final Reader reader = new FileReader("tasks.md");

        int data = reader.read();
        while (data != -1){
            char dataChar = (char) data;
            data = reader.read();
            System.out.print(dataChar);
        }
        reader.close();
    }
}
