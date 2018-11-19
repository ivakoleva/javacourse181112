package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {

    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter gender ");
        String gender = input.next();

        switch (gender){
            case "male":
                System.out.println("xy");
                break;
            case "female":
                System.out.println("xx");
                break;
                default:
                    System.out.println("no match");
                    break;
        }
    }
}
