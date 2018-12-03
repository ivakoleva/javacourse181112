package com.musala.javacourse181112.practice;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFile {
    public static void main(String[] args) {
        Path path = Paths.get("pom.xml");
        boolean exists = Files.exists(path/*, new LinkOption[] {LinkOption.NOFOLLOW_LINKS}*/);
        System.out.println(exists);
    }
}
