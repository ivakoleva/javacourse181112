package com.musala.javacourse181112.tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    public static void main(String[] args) {
        int i;
        int toBeUnread = 3;
        char[] buffer = new char[128];
        boolean l = true;
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buffer)) != -1) {
                System.out.print(buffer);
                int j = 0;
                int c;
                if ((c = pushbackReader.read()) == -1) {
                    l = false;
                    System.out.println(buffer[i - 3] + "" + buffer[i - 2] + "" + buffer[i - 1]);
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}