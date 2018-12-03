package com.musala.javacourse181112.samples.nio2.list.all.files;

import java.io.File;
import java.util.Arrays;

/**
 * TODO: Add docs
 */
public class FindAllHiddenFiles {
	public static void main(String[] args) {
		final File[] files = new File(".").listFiles(f -> f.isHidden());
		//or
		//final File[] files = new File(".").listFiles(File::isHidden);
		Arrays.stream(files).forEach(System.out::println);
	}
}
