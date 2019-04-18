package com.musala.javacourse181112.FirstPartJava.samples.loops.fors;// Program to find the sum of natural numbers from 1 to 1000.

class Number {
   public static void main(String[] args) {
      
      int sum = 0;
	   
      for (int i = 1; i <= 1000; ++i) {
         sum += i;     // sum = sum + i
      }
	   
      System.out.println("Sum = " + sum);
   }
}