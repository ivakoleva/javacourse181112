package com.musala.javacourse181112.FirstPartJava.samples2.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Add docs
 */
public class GenericsJava {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5)); //OK

		for(Object obj : list){
			//type casting leading to ClassCastException at runtime
			System.out.println(obj.toString());
		}
	}
}
