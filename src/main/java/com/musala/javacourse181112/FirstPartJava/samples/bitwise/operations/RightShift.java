package com.musala.javacourse181112.FirstPartJava.samples.bitwise.operations;

class RightShift {
    public static void main(String[] args) {
    	
    	int number = 212;
	    System.out.println(Integer.toBinaryString(212));
    	
    	System.out.println(number >> 1);
    	System.out.println(number >> 0);
    	System.out.println(number >> 8);
    }
}