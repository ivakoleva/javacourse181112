package com.musala.javacourse181112.tasks.io;
//    ** Write exercise - using Writer, write/append
//            *** read from program parameters
//            *** write each parameter to a new line
//            *** write to a file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExercise {
    public static void main(final String[] args) {
        try (final FileWriter fileWriter = new FileWriter("writer.md");
             final FileReader fileReader = new FileReader("writer.md")) {

            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                fileWriter.append(arg).append("\n");
            }
            fileWriter.close();

            int i;

            while ((i = fileReader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
