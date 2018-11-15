package com.musala.javacourse181112;

public class AgeCalculator {
    public static void main(final String[] args){
         System.out.println(args[0] + " " + args[1]);

         int age  = Integer.parseInt(args[0]);
         int yearToAdd = Integer.parseInt(args[1]);
         System.out.println("Future age calculated: " + (age + yearToAdd));

         System.exit(0);
    }
}
