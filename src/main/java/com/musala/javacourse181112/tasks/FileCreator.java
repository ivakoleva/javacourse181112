package com.musala.javacourse181112.tasks;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        final File file = new File("src","voting.txt");
        file.createNewFile();
        System.out.println("file:" + file.exists());
    }
}
