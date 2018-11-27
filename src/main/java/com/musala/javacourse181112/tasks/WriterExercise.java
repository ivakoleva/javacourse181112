package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExercise {
    public static void main(String[] args) {
        try (final FileWriter fileWriter = new FileWriter("writer.md");
             final FileReader fileReader = new FileReader("writer.md")
        ) {
            for (String arg : args) {
                //fileWriter.write(args[i] + "\n");
                fileWriter.append(arg).append("\n");
            }
            fileWriter.close();
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
