package com.musala.javacourse181112.FirstPartJava.samples.nio2.file.operations;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class FilesCopyFile {
	public static void main(String[] args) throws IOException {
		Path source  = Paths.get("file.txt");
		Path target = Paths.get("file-copy.txt");

		try {
			Files.copy(source, target);
			//Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch(FileAlreadyExistsException fae) {
			fae.printStackTrace();
		} catch (IOException e) {
			// something else went wrong
			e.printStackTrace();
		}

		Files.list(Paths.get(".")).forEach(System.out::println);
	}
}
