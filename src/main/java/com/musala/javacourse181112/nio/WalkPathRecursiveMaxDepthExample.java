package com.musala.javacourse181112.nio;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Iva Koleva on 20.12.2018
 */
public class WalkPathRecursiveMaxDepthExample {
    public static void main(final String[] args) throws IOException {
        final FileSystem fileSystem = FileSystems.getDefault();
        for (Path path : fileSystem.getRootDirectories()) {
            Files.walk(path, 3, FileVisitOption.FOLLOW_LINKS)
                    .forEach(System.out::println);
        }
    }
}
