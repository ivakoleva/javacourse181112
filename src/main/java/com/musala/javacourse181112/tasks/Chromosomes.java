package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.nextLine().toLowerCase();

        if (gender.equals("male") || gender.equals("female")) {
            switch (gender.toLowerCase()) {
                case "male":
                    System.out.println("y");
                case "female":
                    if (gender.equals("male")) {
                        System.out.print("");
                    } else {
                        System.out.println("x");
                    }

            }
            System.out.println("x");
        } else {
            System.out.println("Invalid input");
        }
    }
}
