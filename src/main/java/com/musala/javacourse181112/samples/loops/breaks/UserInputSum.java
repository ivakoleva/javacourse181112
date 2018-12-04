package com.musala.javacourse181112.samples.loops.breaks;

import java.util.Scanner;

class UserInputSum {
   public static void main(String[] args) {
      
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);
      
      while (true) {
         System.out.print("Enter a number: ");
         number = input.nextDouble();
         
         if (number < 0.0) {
            break;
         }
         
         sum += number;
      }
      System.out.println("Sum = " + sum);
   }
}