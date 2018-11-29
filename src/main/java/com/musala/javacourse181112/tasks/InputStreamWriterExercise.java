package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamWriterExercise {
    private static final String ENCODING = "Windows-1251";
    private static final String OUTPUT_FILE = "out.txt";
    private static final String INPUT_FILE = "in.txt";

    public static void main(String[] args) {
        try (final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(OUTPUT_FILE), ENCODING));
        final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(INPUT_FILE), ENCODING))) {
            String line;// = reader.readLine();
            while((line = reader.readLine())!=null){
                System.out.println(line);
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
