package com.musala.javacourse181112.tasks;

//   ** PushbackReader exercise
//           *** use buffer of 128 length
//           *** print to stdout
//           *** if last buffer char read is \[a-p\] - unread 3 chars, in order to print them again

public class PushbackReaderExercise {
    public static void main(final String[] args) {
        char[] buff = new char[128];
        try (final PushbackReader pushbackReader =
                     new PushbackReader(new FileReader("tasks.txt"), 3)) {
//            int data = pushbackReader.read();
//            pushbackReader.unread(data);
            int i;
            while ((i = pushbackReader.read(buff)) != -1) {
                System.out.print(buff);


            }
        }

    }
