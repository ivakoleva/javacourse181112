package com.musala.javacourse181112.FirstPartJava.samples.bitwise.operations;

class Complement {
    public static void main(String[] args) {
    	
    	int number = 35, result;

	    System.out.println("35 -> " + Integer.toBinaryString(number));
    	result = ~number;
	    System.out.println("result ->" + Integer.toBinaryString(result));
    	System.out.println(result);
    }
}