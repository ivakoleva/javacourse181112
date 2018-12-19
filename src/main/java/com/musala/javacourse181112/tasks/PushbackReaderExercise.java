package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    private static final String INPUT_FILE_NAME = "input.txt";
    private static final int LIMIT = 3;

    public static void main(final String[] args) {
        getUsePushbackReader();
    }

    private static void getUsePushbackReader() {
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader(INPUT_FILE_NAME), LIMIT + 1);) {
            int i, j, repeat = 0;
            //char[] buf2 = new char[LIMIT];
            final char[] buffer = new char[138];
            while ((i = pushbackReader.read(buffer)) != -1) {
                for (j = 0; (buffer[j] != '\0' || j < i); j++) {
                    System.out.print(buffer[j]);
                    final char curChar = buffer[j];

                    if (curChar >= 'a' && curChar <= 'p') {
                        //System.out.println("\n>"+curChar);
                        /*for(int k=0; k <LIMIT; k++){
                            pushbackReader.unread(buf2[i-k+1]);
                        }*/
                        //pushbackReader.unread(buffer, j - 3, 3);
                        unreadBufferMaxPositions(pushbackReader, buffer, j - 3);

                        System.out.println();
                        break;
                    }
                }
                if (++repeat > 1) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void unreadBufferMaxPositions(final PushbackReader pushbackReader, final char[] charsBuffer, final int offset) throws IOException {
        for (int i = offset; i <= offset + LIMIT; i++) {
            if (i >= 0 && i < charsBuffer.length) {
                pushbackReader.unread(charsBuffer[i]);
            }
        }
    }
}
