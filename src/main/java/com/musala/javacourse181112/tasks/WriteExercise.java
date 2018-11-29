package com.musala.javacourse181112.tasks;

import java.io.*;

public class WriteExercise {
    private static final String OUTPUT_FILE = "output.txt";
    public static void main(String[] args) {
        try (final BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        final BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            String line;// = reader.readLine();
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            for (String str: args){
                writer.write(str + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
