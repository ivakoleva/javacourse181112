package com.musala.javacourse181112.samples.nio2.list.all.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesCertainException {
	public static void main(String[] args) throws Exception {
		Files.newDirectoryStream(Paths.get("."),
				path -> path.toString().endsWith(".xml"))
				.forEach(System.out::println);
	}
}
