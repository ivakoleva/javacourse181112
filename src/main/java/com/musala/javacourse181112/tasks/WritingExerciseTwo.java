package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class WritingExerciseTwo {
    public static void main(final String[] args) {
        try(final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ExerciseTwo.txt")
                     , Charset.forName("CP437")))) {
            String[] parameters = new String[] {"dfsfsdfdsf", "23", "2434werf", "3fsd4"};
            String newLIne = "\n";

            for (String currentParameter: parameters) {
                writer.write(currentParameter);
                writer.write(newLIne);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**final Console console = System.console();
        if (console == null) {
            System.out.println("Console is not supported by OS/JVM");
            System.exit(1);
        }
        Writer writer = console.writer();
        try {
            writer = new OutputStreamWriter(new FileOutputStream("inputstreamwrite.md"),
                    Charset.forName("windows-1251"));
        } catch (IOException ignored) {
        } finally {
            if (writer != null) {
                try {
                    System.out.println("File is null");
                    writer.close();
                } catch (IOException ignore ) }

                }

            }
        }*/


}

