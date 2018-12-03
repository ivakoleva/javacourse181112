package com.musala.javacourse181112.samples.loops.whiles;

import java.util.Scanner;

class DoWhileSum {
   public static void main(String[] args) {
	   
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);

      do {
    	 System.out.print("Enter a number: ");
    	 number = input.nextDouble();
    	 sum += number;
      } while (number != 0.0);
	   
      System.out.println("DoWhileSum = " + sum);
   }
}