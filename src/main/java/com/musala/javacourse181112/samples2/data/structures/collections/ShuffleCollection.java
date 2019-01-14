package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCollection {
	public static void main(String[] argv) throws Exception {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");
		Collections.shuffle(obj);
		System.out.println(obj);
	}
}