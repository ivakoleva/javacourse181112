package com.musala.javacourse181112.MyStuff;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterExerciseExample {
    public static void main(String[] args)throws IOException {
        String str1 = "read from program parameters";
        String str2 ="write each parameter to a new line";
        final Writer writer = new FileWriter("tasks_copy.md");
        writer.write(str1 + System.lineSeparator() + str2);
        writer.close();
    }
}
