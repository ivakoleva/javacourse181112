package com.musala.javacourse181112.FirstPartJava.samples.nio2.list.all.files;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class ListFilterExpression {
	public static void main(String[] args) throws Exception {
		Files.list(Paths.get("."))
				.filter(f -> Files.isRegularFile(f))
				.forEach(System.out::println);
	}
}
