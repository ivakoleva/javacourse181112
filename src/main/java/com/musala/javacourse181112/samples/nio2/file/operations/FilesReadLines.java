package com.musala.javacourse181112.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * TODO: Add docs
 */
public class FilesReadLines {
	public static void main(String[] args) {
		Path path = Paths.get("file.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// something failed
			e.printStackTrace();
		}
	}
}
