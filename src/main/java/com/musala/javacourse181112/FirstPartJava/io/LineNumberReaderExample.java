package com.musala.javacourse181112.FirstPartJava.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class LineNumberReaderExample {
    public static void main(final String[] args) throws IOException {
        try (final LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("tasks.md"))) {
            String line;

            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println("Line number: " + lineNumberReader.getLineNumber());
                System.out.println(line);
            }
        }
    }
}
