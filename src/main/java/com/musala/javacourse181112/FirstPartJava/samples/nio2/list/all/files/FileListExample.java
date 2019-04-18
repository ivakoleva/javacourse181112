package com.musala.javacourse181112.FirstPartJava.samples.nio2.list.all.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FileListExample {
	public static void main(String[] args) throws Exception{
		Files.list(Paths.get(".")).forEach(System.out::println);
	}
}
