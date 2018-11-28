package com.musala.javacourse181112.tasks;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExercise {
    public static void main(final String[] args) {
        try (final FileWriter fileWriter = new FileWriter("WritingParametersInFile.txt")){
            for (String str : args){
                fileWriter.write(str+"\n");
            }
        }catch (IOException ignored){
        }
    }
}
