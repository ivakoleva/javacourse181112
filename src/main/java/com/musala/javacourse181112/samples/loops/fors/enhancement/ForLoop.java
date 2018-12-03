package com.musala.javacourse181112.samples.loops.fors.enhancement;

class ForLoop {
   public static void main(String[] args) {
      
      char[] vowels = {'a', 'e', 'i', 'o', 'u'};

      for (int i = 0; i < vowels.length; ++ i) {
         System.out.println(vowels[i]);
         vowels[i] = 'b';
      }

	   for (int i = 4; i > -1; -- i) {
		   System.out.println(vowels[i]);
	   }
   }
}