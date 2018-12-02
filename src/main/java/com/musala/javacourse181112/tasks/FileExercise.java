package com.musala.javacourse181112.tasks;

import java.io.File;

public class FileExercise {
    public static void main(final String[] args) {
        final File file=new File("testpath");
System.out.println("File exists:"+file.exists());
file.mkdir();

    }

}
