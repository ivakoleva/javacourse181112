package com.musala.javacourse181112.FirstPartJava;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Iva Koleva on 26.11.2018
 */
public class ConsoleExample {
    public static void main(final String[] args) throws IOException, InterruptedException {
        final Console console = System.console();
        if (console == null) {
            System.out.println("Console is not supported by OS/JVM");
            System.exit(1);
        }

        //final Reader reader = console.reader();
        final Writer writer = console.writer();

       /* final char[] buffer = new char[1];
        int i = reader.read(buffer);
        writer.write(buffer, 0, i);
        writer.write(System.lineSeparator());
        writer.flush();*/

        // hidden password show-case
        writer.write("Password:");
        writer.write(System.lineSeparator());
        writer.flush();

        //i = reader.read(buffer);
        //writer.write("read: " + ());

        writer.write(console.readPassword());
        writer.write(System.lineSeparator());
        writer.flush();

        writer.write("Say hi:");
        writer.flush();
        System.out.println(console.readLine());

        System.exit(0);
    }
}
