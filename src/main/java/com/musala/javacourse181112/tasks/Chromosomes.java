package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.nextLine();

        if (gender.equals("male") || gender.equals("female")) {
            switch (gender) {
                case "male":
                    System.out.println("yx");
                    break;
                case "female":
                    System.out.println("xx");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
