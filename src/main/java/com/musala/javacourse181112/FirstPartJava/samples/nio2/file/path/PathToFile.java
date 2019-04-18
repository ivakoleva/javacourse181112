package com.musala.javacourse181112.FirstPartJava.samples.nio2.file.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class PathToFile {
	public static void main(String[] args) {
		File f = Paths.get("file.txt").toFile();
		Path p = new File("file.txt").toPath();
	}
}
