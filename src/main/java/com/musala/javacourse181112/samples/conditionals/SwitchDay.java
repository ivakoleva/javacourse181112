package com.musala.javacourse181112.samples.conditionals;

class SwitchDay {
   public static void main(String[] args) {

      int intDay = 4;
      String day;
	        
      switch (intDay) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
           break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
           break;
         case 5:
           day = "Thursday";
           break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day);
   }
}