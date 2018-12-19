package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExercise {

    private static final String INPUT_FILE_NAME = "input.txt";
    private static final String OUTPUT_FILE_NAME = "output.txt";

    public static void main(final String[] args) {
        useWriter(args);
        useReader();
    }

    private static void useWriter(final String[] args) {
        try (final FileWriter fileWriter = new FileWriter(OUTPUT_FILE_NAME)) {

            for (String str : args) {
                fileWriter.write(str.concat("\n"));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void useReader() {
        try(final FileReader fileReader = new FileReader(INPUT_FILE_NAME);) {
            final char[] buf = new char[1024];

            while (fileReader.read(buf)!=-1){
                System.out.print(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
