package com.musala.javacourse181112.FirstPartJava.samples.access;

public class TestB {

	public static void main(String args[]){
		TestA.methodPublic();
		TestA.methodProtected();
		TestA.methodDefault();
		
	}
	
	public static void methodPublic(){
		System.out.println("Public B");
	}
	
	protected static void methodProtected(){
		System.out.println("Protected B");
	}
	
	static void methodDefault(){
		
	}
	
	private static void methodPrivate(){}

	
}