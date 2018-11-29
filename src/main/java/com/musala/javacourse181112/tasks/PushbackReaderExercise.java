package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static final int LIMIT = 3;

    public static void main(String[] args) {
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader(INPUT_FILE_NAME), LIMIT + 1)) {
            int i, j, repeat = 0;
            final char[] buffer = new char[138];
            while ((i = pushbackReader.read(buffer)) != -1) {
                for (j = 0; (buffer[j] != '\0' || j < i); j++) {
                    System.out.print(buffer[j]);
                    char currentChar = buffer[j];

                    if (currentChar >= 'a' && currentChar <= 'p') {
                        pushbackReader.unread(buffer[j]);
                        pushbackReader.unread(buffer[--j]);
                        pushbackReader.unread(buffer[--j]);
                        System.out.println();
                        break;
                    }

                }
                if (++repeat > 1) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            ;
        }
    }
}