package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackReaderExercise {
    private final static char[] BUFF = new char[128];
    private final static String INPUT_FILE = "input.txt";
    private final static int PUSHBACK_LIMIT = 3;
    //final static char[] UNREAD_ARR = new char[PUSHBACK_LIMIT];
    public static void main(String[] args) {
        try(final PushbackReader pushbackReader = new PushbackReader(new FileReader(INPUT_FILE), PUSHBACK_LIMIT)){
            int i;// = reader.readLine();
            while((i = pushbackReader.read(BUFF))!= -1){
                System.out.println((char) i);

            }
            char lastChar = BUFF[BUFF.length - 1];
            if (lastChar >= 'a' || lastChar <= 'p'){
                pushbackReader.unread(lastChar);
                pushbackReader.unread(--lastChar);
                pushbackReader.unread(--lastChar);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
