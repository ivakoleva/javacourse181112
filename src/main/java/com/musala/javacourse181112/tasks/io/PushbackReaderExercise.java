package com.musala.javacourse181112.tasks.io;

//   ** PushbackReader exercise
//           *** use buffer of 128 length
//           *** print to stdout
//           *** if last buffer char read is \[a-p\] - unread 3 chars, in order to print them again

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.stream.IntStream;

public class PushbackReaderExercise {
    public static void main(final String[] args) {
        final char[] buffer = new char[128];
        try (final PushbackReader pushbackReader =
                     new PushbackReader(new FileReader("tasks.md"), 3)) {
            int i;
            while ((i = pushbackReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, i));

                final int k = i - 1;
                if (buffer[k] >= 'a' && buffer[k] <= 'p') {
                    System.out.println("--------");
                    IntStream.range(0, 3).forEach(j -> {
                        try {
                            pushbackReader.unread(buffer[k - j]);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        //System.out.println(buffer);
                    });
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


