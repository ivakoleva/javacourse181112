package com.musala.javacourse181112.FirstPartJava.samples2.generics.inheritance;

public class GenericsInheritance {

	public static void main(String[] args) {
		String str = "abc";
		Object obj = new Object();
		obj=str; // works because String is-a Object, inheritance in java
		
		MyClass<String> myClass1 = new MyClass<String>();
		MyClass<Object> myClass2 = new MyClass<Object>();
		//myClass2=myClass1; // compilation error since MyClassSimple<String> is not a MyClassSimple<Object>
		obj = myClass1; // MyClassSimple<T> parent is Object
	}
	
	public static class MyClass<T>{}

}