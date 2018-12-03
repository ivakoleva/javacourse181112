package com.musala.javacourse181112.samples.loops.continues;

class Test {
   public static void main(String[] args) {
      
      for (int i = 1; i <= 10; ++i) {      
         if (i > 4 && i < 9) {
            continue;
         }      
         System.out.println(i);
      }   
   }
}