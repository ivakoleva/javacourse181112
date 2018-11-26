package com.musala.javacourse181112.io;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ConsoleExample {
    public static void main(String[] args) throws IOException {
        final Console console = System.console();
        if (console == null) {
            System.out.println("Console is not supported by OS/JVM");
            System.exit(1);

        }

        final Reader reader = console.reader();
        final Writer writer = console.writer();

//        final char[] buffer = new char[1];
//        int i = reader.read(buffer);
//        writer.write(buffer, 0, i);
//        writer.flush();

        writer.write("Password");
        writer.write(System.lineSeparator());
        writer.flush();

        writer.write(console.readPassword());
        writer.write(System.lineSeparator());
        writer.flush();

        writer.write("Say hi:");
        writer.flush();
        System.out.println(console.readLine());

        System.exit(0);


    }
}
