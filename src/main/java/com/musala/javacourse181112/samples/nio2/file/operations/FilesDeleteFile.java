package com.musala.javacourse181112.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesDeleteFile {
	public static void main(String[] args) {
		Path path = Paths.get("file-moved.txt");
		try {
			Files.delete(path);
		} catch (IOException e) {
			// deleting failed
			e.printStackTrace();
		}
	}
}
