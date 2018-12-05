package com.musala.javacourse181112.MyStuff;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        final File file = new File("test");
        file.mkdir();//Makes the file into a directory
        if (file.exists())
            System.out.println("The file exits!" + file.exists());
        else
            System.out.println("The file doesn't exist." + file.exists());
        final File textFile = new File(file,"textFile.txt");
        final File textFile1 = new File(file,"textFile1.txt");
        textFile.createNewFile();
        textFile1.createNewFile();
        deleteOnExit(file);
    }
    private static void deleteOnExit(File file){
        final File deleteFile = new File(file, "deletedFile.txt");
        System.out.println("File has been created and will be deleted "+deleteFile.getAbsolutePath());
        deleteFile.deleteOnExit();
    }
}