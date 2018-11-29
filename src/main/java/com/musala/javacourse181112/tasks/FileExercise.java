package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExercise {
    public static void main(String[] args) {
        File fileDir = new File ("D:\\course\\test_file"); // don't see the dir in windows explorer
        if(fileDir.exists()){
            try{
                fileDir.mkdir();
                File file2 = new File (fileDir, "test1.txt");
                File file3 = new File (fileDir, "test2.txt");
            }catch (SecurityException e){
                e.printStackTrace();
            }

        }
        File fileForDeletion = new File ("fileForDeletion.txt");
        fileForDeletion.deleteOnExit();

        System.out.println(fileForDeletion.getAbsolutePath());
        System.exit(0);
    }

}
