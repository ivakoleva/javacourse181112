package com.musala.javacourse181112.FirstPartJava.samples.nio2.file.operations;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * TODO: Add docs
 */
public class BufferedWriterSample {
	public static void main(String[] args) {
		//Get the file reference
		Path path = Paths.get("output.txt");

		//Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path))
		{
			writer.write("Hello World !!");
			for (int i = 0; i < 5000; i++) {
				writer.write("Line " + i) ;
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
