package com.musala.javacourse181112.MyStuff;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
*  Reader exercise
*  read characters from task md  using file reader
*  write to stdout, optimise(take a look ay parameters available for
*  systems.out.println(), placing a pointer at () then ctrl+p)
*
* */

public class ReaderExerciseExample {
    public static void main(String[] args) throws IOException {
        int i;
        final char buffer[]= new char[1024];
        final Reader reader= new FileReader("tasks_copy.md");
        while((i = reader.read(buffer))!= -1){
            System.out.println(new String(buffer)); //???
        }
        reader.close();
    }
}