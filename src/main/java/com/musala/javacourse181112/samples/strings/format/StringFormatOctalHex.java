package com.musala.javacourse181112.samples.strings.format;

/**
 * TODO: Add docs
 */
public class StringFormatOctalHex {
	public static void main(String[] args) {
		System.out.println(String.format("|%#o|", 93));
		// prints: 0135

		System.out.println(String.format("|%#x|", 93));
		// prints: 0x5d

		System.out.println(String.format("|%#X|", 93));;
		// prints: 0X5D

	}
}
