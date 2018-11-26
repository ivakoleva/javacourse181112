package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(final String[] args) throws IOException {
        final FileReader fileReader = new FileReader("tasks.md");
        int i;
        final char buffer[] = new char[1024];

        while ((i = fileReader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, i));

        }
        fileReader.close();
    }
}
