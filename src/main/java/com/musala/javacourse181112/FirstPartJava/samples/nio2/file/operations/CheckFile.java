package com.musala.javacourse181112.FirstPartJava.samples.nio2.file.operations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class CheckFile {
	public static void main(String[] args) {
		Path path = Paths.get("pom.xml");
		boolean exists = Files.exists(path);
		System.out.println(exists);
		//System.out.println(Files.notExists(path));
	}
}
