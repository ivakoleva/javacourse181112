package com.musala.javacourse181112.tasks;

import java.io.*;

public class ReaderExercise {
    public static void main(String[] args) throws IOException {
        FileReader readerExample = new FileReader("tasks.md");
        final char[] buffer = new char[1027];

        int i;
        while((i = readerExample.read(buffer)) != -1){
            System.out.println(new String(buffer));
        }

    }
}
