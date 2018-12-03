package com.musala.javacourse181112.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWrite {
    public static void main(String[] args) throws IOException {
        String content = "ABCDE";
        Files.write(Paths.get("source.txt"), content.getBytes());
    }
}
