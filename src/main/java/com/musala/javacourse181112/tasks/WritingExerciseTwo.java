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




}

