package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExercise {
    public static void main(final String[] args) throws IOException {
        FileReader fileReader = new FileReader("tasks.md");
        int i;
       /* char[] buffer = new char[1027];
        buffer[0] = 'a';
        buffer[1] = 'b';
        buffer[2] = 'c';
        while ((i = fileReader.read(buffer, 3, buffer.length - 3)) != -1) {
            System.out.print(new String(buffer, 3, i));
        }
        */
        char[] buffer = new char[1024];
        while ((i = fileReader.read(buffer)) != -1) {
            System.out.print(new String(buffer, 0, i));
        }
        fileReader.close();
    }
}
