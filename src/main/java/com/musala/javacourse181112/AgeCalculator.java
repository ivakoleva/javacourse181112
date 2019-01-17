package com.musala.javacourse181112;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your age and the years you wish to add " +
                "to them, separated with space: ");
        Scanner scanner = new Scanner(System.in);

        int ageInt = scanner.nextInt();
        int yearsInt = scanner.nextInt();
        int calculatedAge = ageInt + yearsInt;
        System.out.println(calculatedAge);
        System.exit(0);
    }


}
