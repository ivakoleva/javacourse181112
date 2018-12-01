package com.musala.javacourse181112.tasks;

//   ** PushbackReader exercise
//           *** use buffer of 128 length
//           *** print to stdout
//           *** if last buffer char read is \[a-p\] - unread 3 chars, in order to print them again

import java.io.*;
import java.util.Arrays;

public class PushbackReaderExercise {
    public static void main(final String[] args) {
        char[] buff = new char[128];
        try (final Reader reader =
                     new PushbackReader(new FileReader("tasks_copy.txt"), 3)) {
            int i;
//            char[] oldBuff = new char[128];
            while ((i = reader.read(buff)) != -1) {
                System.out.print(buff);
            }

            if (buff[i] >= 'a' && buff[i] <= 'p') {
                ((PushbackReader) reader).unread(3);
                System.out.println(buff);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


