package com.musala.javacourse181112.tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
///NOT WORKING
public class PushbackReaderExercise {
    public static void main(final String[] args) {
        int i;

        try(final PushbackReader pushbackReader=new PushbackReader(new FileReader("test.txt"),128)){
            while((i=pushbackReader.read())!=-1){
                System.out.print((char)i);
            }

                pushbackReader.unread((char)i);
                i=pushbackReader.read();
                System.out.println(i+"test");
            } catch (IOException ignored) {

        }

    }


    }

