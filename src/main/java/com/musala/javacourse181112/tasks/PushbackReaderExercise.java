package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {
    public static void main(String[] args) {
        int i;
        int toBeUnread = 3;
        char[] buffer = new char[128];
        try(PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParametersInFile.txt"),
                toBeUnread+1)) {
            while ((i = pushbackReader.read(buffer)) != -1) {
                System.out.print(buffer);
                int j=0;
                while(Character.isWhitespace(buffer[i-1-j])){
                    j++;
                }
                if (buffer[i -1-j] >= 'a' && buffer[i -1- j] <= 'p') {
                    for(int k=0;k<toBeUnread+j;k++){
                        pushbackReader.unread(buffer[i-k-1]);
                    }
                }

            }
            System.out.println(System.lineSeparator());
        }catch (IOException ignored){
        }
    }
}
}
