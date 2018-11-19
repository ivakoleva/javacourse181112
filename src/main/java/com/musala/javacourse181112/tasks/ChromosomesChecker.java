package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class ChromosomesChecker {
    private static final String FEMALE_CHROMOSOMES = "xx";
    private static final String MALE_CHROMOSOMES = "xy";

    public static void main(String[] args) {
        System.out.println("Enter your gender");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        switch (gender){
            case "female":
                System.out.println(FEMALE_CHROMOSOMES);
                break;
            case "male":
                System.out.println(MALE_CHROMOSOMES);
                break;
            default:
                System.out.println("Sorry we assumed your gender. ");
        }


    }
}
