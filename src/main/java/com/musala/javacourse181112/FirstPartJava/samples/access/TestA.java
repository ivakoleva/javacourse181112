package com.musala.javacourse181112.FirstPartJava.samples.access;

class TestA {

	public static void methodPublic(){
		methodPrivate();
	}
	
	protected static void methodProtected(){
		methodPrivate();
		System.out.println("protected");
	}
	
	static void methodDefault(){
		methodPrivate();
	}
	
	private static void methodPrivate(){}
}