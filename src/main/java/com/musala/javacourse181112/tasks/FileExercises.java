package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

public class FileExercises {
    public static void main(String[] args) throws IOException {
      creatingFile();
      doDeleteOnExit();
    }

    private static void creatingFile() throws IOException {
        final File file = new File("exampleDir");
       if (file.exists()){
           System.out.println("File exist");
       }

       if(!file.mkdir()){
           System.out.println("Can not make directory ");
           System.exit(1);
       }

        System.out.println("fileOne crated " + new File(file,"fileOne").createNewFile());
        System.out.println("fileTwo created " + new File(file,"fileTwo").createNewFile());
    }

    private static void doDeleteOnExit() throws IOException {
        final File file = new File("deleteOnExit");
        file.createNewFile();
        file.deleteOnExit();

        final String parentPathName = file.getAbsoluteFile().getParent();//return pathName string or null
        if (parentPathName == null){
            System.out.println("path name is null ");
            System.exit(1);
        }

        final File parentFile = new File(parentPathName);
        final String[] parentListArray = parentFile.list();
        if (parentListArray == null){
            System.out.println("Parent list is null");
            System.exit(1);
        }

        final Optional<String> filenameOptional = Arrays.stream(parentFile.list())
                .filter(filename -> filename.equals("deleteOnExit"))
                .findAny();
        System.out.println("filename listed: " + filenameOptional.isPresent());
        System.exit(0);
    }
}
