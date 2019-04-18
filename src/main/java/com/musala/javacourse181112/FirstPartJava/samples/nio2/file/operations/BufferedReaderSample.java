package com.musala.javacourse181112.FirstPartJava.samples.nio2.file.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class BufferedReaderSample {
	public static void main(String[] args) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("output.txt"))) {
			reader.lines().map(String::toLowerCase).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
