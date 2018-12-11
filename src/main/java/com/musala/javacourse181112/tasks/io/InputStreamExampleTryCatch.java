package com.musala.javacourse181112.tasks.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExampleTryCatch {
    public static void main(final String[] args) {
        try (final InputStream inputStream = new FileInputStream("sketch.txt");) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}