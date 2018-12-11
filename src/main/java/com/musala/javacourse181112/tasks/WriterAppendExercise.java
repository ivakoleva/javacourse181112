package com.musala.javacourse181112.tasks;

import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class WriterAppendExercise {
    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("a_file.txt");
            for (int i = 0; args.length > i; i++) {
                InputStream inputStream = new ByteArrayInputStream(args[i].getBytes());
                writer.write(args[i] + "\n");
                writer.flush();
            }
            writer.close();
        } catch (IOException ignored) {

        }
    }
}
