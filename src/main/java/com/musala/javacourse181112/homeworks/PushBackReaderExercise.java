package com.musala.javacourse181112.homeworks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackReaderExercise {
    public static void main(String[] args) {
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader("tasks.md"), 128)) {
            int i;
            while ((i = pushbackReader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
