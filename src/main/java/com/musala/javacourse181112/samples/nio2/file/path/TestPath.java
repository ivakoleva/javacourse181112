package com.musala.javacourse181112.samples.nio2.file.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class TestPath {
	public static void main(String[] args) {
		Path p1 = Paths.get("file.txt");
		Path p2 = p1.toAbsolutePath();
		System.out.println(p2);
	}

}
