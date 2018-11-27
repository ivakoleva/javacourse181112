package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamWriteExercise {
    public static void main(final String[] args) {
        try (final BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream("Write.txt"),
                Charset.forName("Windows-1251")));
             final BufferedWriter os = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Writer.txt")
                     , Charset.forName("Windows-1251")))) {

            String line;
            while ((line = is.readLine())!= null) {
                System.out.println(line);
                os.write(line + "\n");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
