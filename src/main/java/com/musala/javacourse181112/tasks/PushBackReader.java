package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackReader {
    public static void main(String[] args) {

        char[] readedData = new char[128];
        try (final PushbackReader pushbackReader = new PushbackReader(new FileReader("tasks.md"), 3)) {
            int i;
            int arrayCount = 0;
            while ((i = pushbackReader.read()) != -1) {
                if(arrayCount < readedData.length) {
                    readedData[arrayCount] = (char) i;
                    System.out.print(readedData[arrayCount]);
                    arrayCount++;
                }
            }

            char lastSymbol = readedData[readedData.length-1];
            if(lastSymbol >= 'a' && lastSymbol <= 'p'){
                pushbackReader.unread(readedData, readedData.length -3, 3);
            }

            System.out.println("\nThe last three symbols: ");
            while ((i = pushbackReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
