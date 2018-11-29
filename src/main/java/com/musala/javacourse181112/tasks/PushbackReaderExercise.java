package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    public static void main(final String[] args) {
        pushBackReaderExerciseIdea_brokenVersion();
        //pushBackReaderExerciseIdea_workingVersion();
        // TODO: implement 3-line requirements; all pieces are here
    }

    private static void pushBackReaderExerciseIdea_brokenVersion() {
        int i;
        int toBeUnread = 3;
        char[] buff = new char[128];
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buff)) != -1) {
                System.out.print(buff);
                int j = 0;
                while (Character.isWhitespace(buff[i - 1 - j])) {
                    j++;
                }
                if (buff[i - 1 - j] >= 'a' && buff[i - 1 - j] <= ('a' + 'z') / 2) {
                    for (int k = 0; k < toBeUnread + j; k++) {
                        pushbackReader.unread(buff[i - k - 1]);
                    }
                }
            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }

    private static void pushBackReaderExerciseIdea_workingVersion() {
        int i;
        int toBeUnread = 3;
        final char[] buffer = new char[128];
        boolean l = true;
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buffer)) != -1) {
                System.out.print(buffer);
                int j = 0;
                int c;
                if ((c = pushbackReader.read()) == -1) {
                    l = false;
                    System.out.println("" + buffer[i - 3] + buffer[i - 2] + buffer[i - 1]);
                } else {
                    pushbackReader.unread(c);
                }
                while (Character.isWhitespace(buffer[i - 1 - j])) {
                    j++;
                }
                if (buffer[i - 1 - j] >= 'a' && buffer[i - 1 - j] <= ('a' + 'z') / 2 && l) {
                    for (int k = 0; k < toBeUnread + j; k++) {
                        pushbackReader.unread(buffer[i - k - 1]);
                    }
                }
            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }
}
