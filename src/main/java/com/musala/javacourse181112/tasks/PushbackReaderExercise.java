package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

///NOT WORKING
public class PushbackReaderExercise {
    public static void main(final String[] args) {
        int i;
        final char[] buffer = new char[128];
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader("test.txt"), 3)) {
            while ((i = pushbackReader.read(buffer)) != -1) {
                System.out.print(buffer);
                if(buffer[i-1]>='a'&& buffer[i-1]<='p') {
                    pushbackReader.unread(buffer, i-3 , 3);
                    i = pushbackReader.read(buffer);
                    System.out.println(new String(buffer, 0, i));
            }

            }

        } catch (IOException ignored) {

        }

    }


}

