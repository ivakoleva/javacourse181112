package com.musala.javacourse181112;

public class AgeCalculator {
    public static void main(String[] args) {
        int age, ageAdded, ageAfter;
        age = Integer.parseInt(args[0]);
        ageAdded = Integer.parseInt(args[1]);
        System.out.println("Your age:" + age);
        System.out.println("Age to add:" + ageAdded);
        ageAfter = age + ageAdded;
        System.out.println("Your age after " + ageAdded + " years will be " + ageAfter );

        System.exit( 0);




    }
}
