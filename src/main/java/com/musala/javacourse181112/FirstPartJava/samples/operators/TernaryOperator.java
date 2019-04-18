package com.musala.javacourse181112.FirstPartJava.samples.operators;

class TernaryOperator {
    public static void main(String[] args) {
    	
    	int februaryDays = 29;
    	String result;
    	
    	result =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
    	System.out.println(result);
    }
}