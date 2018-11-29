package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class ChromosomesChecker {
    private static final String FEMALE_CHROMOSOMES = "xx";
    private static final String MALE_CHROMOSOMES = "xy";

    public static void main(String[] args) {
        System.out.println("Enter your gender");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        String chromosomeString = "";
        switch (gender.toLowerCase()){
            case "female":
                chromosomeString += "x";
                System.out.println(FEMALE_CHROMOSOMES);

            case "male":
                chromosomeString += "x";
                if(chromosomeString.length() == 2) {
                    break;
                }
                System.out.println(MALE_CHROMOSOMES);

            default:
                chromosomeString += "y";
                System.out.println("Sorry we assumed your gender. ");
        }

        System.out.println("Chromosomes for gender: " + gender);
        System.out.println(chromosomeString);



    }
}
