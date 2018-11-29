package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {

    public static void main(String[] args) {
        //PushBackReaderExerciseIdea_brokenVersion();
        PushBackReaderExerciseIdea_unbrokenVersion();

    }

    private static void PushBackReaderExerciseIdea_brokenVersion() {
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

    private static void PushBackReaderExerciseIdea_unbrokenVersion() {
        int i;
        int toBeUnread = 3;
        char[] buff = new char[128];
        boolean l=true;
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buff)) != -1) {
                System.out.print(buff);
                int j = 0;
                int c;
                if((c = pushbackReader.read()) == -1) {
                    l=false;
                    System.out.println(buff[i-3]+""+buff[i-2]+""+buff[i-1]);
                }
                else {
                    pushbackReader.unread(c);
                }
                while (Character.isWhitespace(buff[i - 1 - j])) {
                    j++;
                }
                if (buff[i - 1 - j] >= 'a' && buff[i - 1 - j] <= ('a' + 'z') / 2 && l ) {
                    for (int k = 0; k < toBeUnread + j; k++) {
                        pushbackReader.unread(buff[i - k - 1]);
                    }
                }
            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }
}
