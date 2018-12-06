package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/*
 ** File exercise
 *** creation
 **** create a file using a non-existing path
 **** show if file exists
 **** create as directory
 **** create two new files into that directory
 *** delete on exit
 **** create a new file
 **** mark for deletion on exit
 **** list parent directory, containing this filename (to prove existence in runtime)
 **** exit program, then check manually if file exists

 */
public class FileExercise {
    public static void main(String[] args) {
        // creation();
        delete_on_exit();
    }

    public static void creation() {
        File file = new File("test");
        System.out.println("File exists? " + file.exists());
        boolean b = file.mkdirs();
        if (b) {
            File file1 = new File(file, "test1.txt");
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file2 = new File(file, "test2.txt");
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void delete_on_exit() {
        File file = new File("test1/test", "delete_on_exit_test.txt");
        file.mkdirs();
        file.deleteOnExit();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> pathList = Arrays.asList(file.getAbsoluteFile().toString().split("\\\\"));
        pathList.forEach(System.out::println);
    }
}
