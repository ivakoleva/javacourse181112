package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.basics.Gender;

import java.util.Scanner;

public class Chromosomes {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String gender = sc.nextLine().toLowerCase()
        Gender gender = Gender.FEMALE;
        gender = Gender.MALE;
//        if(args.length > 0 && args[0] != null);{
//            System.out.println("Usage : java ChromosomesApplication male|female");
//            System.exit(1);
//        }
//        final Gender gender = "female".equalsIgnoreCase(args[0]) ? Gender.FEMALE : Gender.MALE;

        if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) {
            switch (gender) {
                case MALE:
                    System.out.println("y");
                case FEMALE:
                    if (gender.equals(Gender.MALE)) {
                        break;
                    } else {
                        System.out.println("x");
                    }
            }
            System.out.println("x");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
