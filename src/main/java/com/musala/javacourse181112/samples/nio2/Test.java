package com.musala.javacourse181112.samples.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * TODO: Add docs
 */
public class Test {
	public static void main(String[] args) {
		try (Stream<Path> stream = Files.list(Paths.get("/tmp"))) {
			stream.map(String::valueOf)
					.filter(path -> path.endsWith(".txt"))
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
