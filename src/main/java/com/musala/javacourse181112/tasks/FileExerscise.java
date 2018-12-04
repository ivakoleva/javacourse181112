package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

public class FileExerscise {
    public static void main(final String[] args) throws IOException {
        /*
         * ** File exercise
         *** creation
         **** create a file using a non-existing path
         **** show if file exists
         **** create as directory
         **** create two new files into that directory
         *** delete on exit
         **** create a new file
         **** mark for deletion on exit
         **** list parent directory, containing this filename (to prove existence in runtime)
         **** exit program, then check manually if file exists*/
        doCreation();
        doDeleteOnExit();
    }

    public static void doCreation() throws IOException {
        final File file = new File("myDir");
        System.out.println("file exist: " + file.exists());

        if (!file.mkdir()) {
            System.out.println("cannot make dir");
            System.exit(1);
        }

        System.out.println("myFile1 created " +
                new File(file, "myFIle1").createNewFile());
        System.out.println("myFile2 created " +
                new File(file, "myFIle2").createNewFile());
    }

    public static void doDeleteOnExit() throws IOException {
        final File file = new File("deleteOnExitFile.txt");
        file.createNewFile();
        file.deleteOnExit();
        final String parent = file.getAbsoluteFile().getParent();
        if (parent == null) {
            System.out.println("parent null, exiting");
            System.exit(1);
        }
        final File parentFile = new File(parent);
        final String[] parentFileList = parentFile.list();
        if (parentFileList == null) {
            System.out.println("parent list null, exiting");
            System.exit(1);

        }
    }
}
