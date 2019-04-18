package com.musala.javacourse181112.FirstPartJava.samples.bitwise.operations.unsigned;

class RightShift {
    public static void main(String[] args) {
    	
    	int number1 = 5, number2 = -5;
    	
    	// Signed right shift 
    	System.out.println(number1 >> 1);
    	
    	// Unsigned right shift
    	System.out.println(number1 >>> 1);
    	
    	// Signed right shift 
    	System.out.println(number2 >> 1);
    	
    	// Unsigned right shift
    	System.out.println(number2 >>> 1);
    }
}