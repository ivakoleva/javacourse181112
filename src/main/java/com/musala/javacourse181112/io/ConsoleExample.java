package com.musala.javacourse181112.io;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ConsoleExample {
    public static void main(final String[] args) throws IOException, InterruptedException {
        final Console console = System.console();
        if (console == null) {
            System.out.println("Console not supported by OS/JVM");
            System.exit(1);
        }

        final Reader reader = console.reader();
        final Writer writer = console.writer();

        final char[] buffer = new char[1];
        int i = reader.read(buffer);
        writer.write(buffer, 0, i);
        writer.write(System.lineSeparator());
        writer.flush();

        //hidden password show-case
        writer.write("Password");
        writer.write(System.lineSeparator());
        writer.flush();
        Thread.sleep(1000);

        i = reader.read(buffer);
        writer.write(buffer, 0, i);
        writer.write(System.lineSeparator());
        writer.flush();

        System.exit(0);
    }
}
