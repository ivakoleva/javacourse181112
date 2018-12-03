package com.musala.javacourse181112.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesWrite {
	public static void main(String[] args) throws IOException {
		String content = "ABCDEFGH";

		Files.write(Paths.get("source.txt"), content.getBytes());
	}
}
