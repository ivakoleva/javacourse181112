package com.musala.javacourse181112.samples.nio2.file.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class PathComponents {
	public static void main(String[] args) {
		Path path = Paths.get("file.txt");
		System.out.println(path);
		path = path.toAbsolutePath();
		System.out.println(path);
		path = path.getFileName(); // returns file.txt
		System.out.println(path);
		path = path.getName(0); // returns users
		System.out.println(path);
		path = path.toAbsolutePath();
		int count = path.getNameCount(); // returns 5
		System.out.println("Count " + count);
		path = path.subpath(0, 2); // returns Users/Itso
		System.out.println(path);
		path = path.getParent(); // returns Users
		System.out.println(path);
		path = path.toAbsolutePath();
		path = path.getRoot(); // returns / if we were in a unix filesystem
		System.out.println(path);
	}
}
