package com.musala.javacourse181112.tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewInputExercise {
    public static void main(final String[] args) throws IOException {
        FileReader fileReader = new FileReader("tasks.md");
        char[] buffer=new char[1027];
        buffer[0]='a';
        buffer[1]='b';
        buffer[2]='c';
        int i;
        while((i=fileReader.read(buffer,3,buffer.length-3))!=-1){
            System.out.println(new String(buffer,3,i));
        }
        fileReader.close();
    }
}
