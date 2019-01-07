package com.musala.javacourse181112.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesWalkExample {
	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("."))
				.filter(p -> p.toString().endsWith(".java"))
				.map(p -> p.getParent().getParent())
				.distinct()
				.forEach(System.out::println);
	}
}
