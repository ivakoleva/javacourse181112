package com.musala.javacourse181112.practice;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileListExample {
    public static void main(String[] args) throws Exception {
        Files.list(Paths.get(".")).forEach(System.out::println);
        Files.newDirectoryStream(Paths.get(".")).forEach(System.out::println);// creates the path
        Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);
        // filter(Files::isRegularFile) = filter (f -> Files.isRegularFile(f))
        Files.newDirectoryStream(Paths.get("."), path -> path.toString().endsWith(".txt"));

    }
}
