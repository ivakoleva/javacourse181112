package com.musala.javacourse181112.io;

import java.io.*;

public class FileExercise {
    public static void main(final String[] args) throws IOException {
        final File file = new File("src", "test");
        file.createNewFile();
        System.out.println("File " + file.exists());
        if(!file.mkdir()) {
            final File file1 =new File(file,"file1");
        }
    }


}
