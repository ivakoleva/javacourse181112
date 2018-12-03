package com.musala.javacourse181112.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesMoveFile {
	public static void main(String[] args) {
		Path source  = Paths.get("file.txt");
		Path target = Paths.get("file-moved.txt");

		try {
			Files.move(source, target);
			//Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch(FileAlreadyExistsException fae) {
			fae.printStackTrace();
		} catch (IOException e) {
			// something else went wrong
			e.printStackTrace();
		}
	}
}
