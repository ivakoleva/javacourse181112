package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewInputOutputExercise {
    public static void main(final String[] args) {
        usingReaderClass();
        usingWriterClass(args);
    }

    private static void usingReaderClass() {
        try (final FileReader fileReader = new FileReader("tasks.md")) {
            final char[] buffer = new char[1024];
            while (fileReader.read(buffer) != -1) {
                System.out.print(buffer);
            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }

    private static void usingWriterClass(final String[] args) {
        try (final FileWriter fileWriter = new FileWriter("WritingParameters.txt");) {
            for (final String s : args) {
                fileWriter.write(s + System.lineSeparator());   //version 1: 1 lined
                //fileWriter.write(s);           //version 2: 2 lined
                //fileWriter.write("\n");
            }
        } catch (IOException ignored) {
        }
    }
}