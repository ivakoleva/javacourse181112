package com.musala.javacourse181112.samples.output;

import java.util.Scanner;

class SimpleInput {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter an integer: ");
    	int number = input.nextInt();
    	System.out.println("You entered " + number);
    }
}
