package com.musala.javacourse181112.FirstPartJava.samples2.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add docs
 */
public class MoreWildcards {

	public static void main(String[] args) {
		List<? extends Integer> intList = new ArrayList<>();
		System.out.println(intList);
		List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
	}

	public static void addIntegers(List<? super Integer> list){
		list.add(new Integer(50));
	}

}
