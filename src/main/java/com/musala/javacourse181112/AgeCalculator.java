package com.musala.javacourse181112;

public class AgeCalculator {
    public static void main(String[] years) {
        System.out.println("Enter your age and the years you wish to add " +
                "to them, separataed with space: ");
        int ageInt = Integer.parseInt(years[0]);
        int yearsInt = Integer.parseInt((years[1]));
        int calculatedAge = ageInt + yearsInt;
        System.out.println(calculatedAge);
        System.exit(0);
    }


}
