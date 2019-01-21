package com.musala.javacourse181112.tasks;

import java.io.IOException;
import java.nio.file.*;

public class FileVisitorExercise {
    public static void main(final String[] args) throws IOException {
        visitRecursively();
    }

    private static void visitRecursively() throws IOException {
        final FileSystem fileSystem = FileSystems.getDefault();
        for(Path path : fileSystem.getRootDirectories()){
            Files.walk(path, 3, FileVisitOption.FOLLOW_LINKS)
                    .forEach(System.out::println);
        }
    }
}
