package com.musala.javacourse181112.practice;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered: " + number);
    }
}
