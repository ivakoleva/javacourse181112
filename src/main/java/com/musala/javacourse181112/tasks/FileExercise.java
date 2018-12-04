package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(final String[] args) throws IOException {
        final File file=new File("testpath");
System.out.println("File exists:"+file.exists());
file.mkdir();
        System.out.println("Making Filie 1 "+ new File(file,"child1").createNewFile());
        System.out.println("Making Filie 2 "+ new File(file,"child2").createNewFile());
        deleteOnExit();
    }


    public static void deleteOnExit() throws IOException {
        final File file1=new File("TestDelete.txt");
        System.out.println(file1.createNewFile());
        file1.deleteOnExit();

        System.out.println("File existst "+file1.getAbsolutePath()+"\t"+ file1.exists());



    }
}
