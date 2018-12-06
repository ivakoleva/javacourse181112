package com.musala.javacourse181112.samples.loops.continues;

import java.util.Scanner;

class SumPositive {
   public static void main(String[] args) {
      
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);
      
      for (int i = 1; i < 6; ++i) {
         System.out.print("Enter a number: ");
         number = input.nextDouble();
         
         if (number <= 0.0) {
            continue;
         }
         
         sum += number;
      }
      System.out.println("Sum = " + sum);
   }
}