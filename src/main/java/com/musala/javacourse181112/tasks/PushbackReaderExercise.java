package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    public static void main(final String[] args) {
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader("tasks.md"), 128)) {
            int i;
            while ((i = pushbackReader.read()) != -1) {
                // TODO
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
