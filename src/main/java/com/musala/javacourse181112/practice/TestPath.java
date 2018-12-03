package com.musala.javacourse181112.practice;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
    public static void main(String[] args) {
        Path p1 = Paths.get("file.txt"); // relative path
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
    }
}
