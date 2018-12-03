package com.musala.javacourse181112.practice;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToFile {
    public static void main(String[] args) {
        File f = Paths.get("file.txt").toFile();
//        Path p = File.("file.txt").toPath();

    }
}
