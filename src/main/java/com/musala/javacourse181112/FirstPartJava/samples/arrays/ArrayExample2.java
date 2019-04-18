package com.musala.javacourse181112.FirstPartJava.samples.arrays;

class ArrayExample2 {
   public static void main(String[] args) {

      int[] age = {12, 4, 5, 2, 5};

      for (int i = 0; i < 5; ++i) {
         System.out.println("Element at index " + i +": " + age[i]);
      }
   }
}