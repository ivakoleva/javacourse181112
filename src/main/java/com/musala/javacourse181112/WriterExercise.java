package com.musala.javacourse181112;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExercise {
    public static void main(final String[] args) {
        try (final FileWriter fileWriter = new FileWriter("writer.txt");
             final FileReader fileReader = new FileReader("tasks.md")
             ) {
                 int j;
                 while ((j = fileReader.read()) != -1) {
                     System.out.println((char) j);
                     fileWriter.write((char) j + "\n");
                 }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
