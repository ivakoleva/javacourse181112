package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class FutureAgeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter current age:");
        int age = scan.nextInt();
        System.out.println("Enter period if you want to stop enter '0'");
        int period = scan.nextInt();
        int futureAge = age;
        while (period != 0){
            futureAge+=period;
            period = scan.nextInt();
        }
        System.out.println("Input age: " + age);
        System.out.println("Input period: " + (futureAge - age));
        System.out.println("Age in future: " + futureAge);
    }
}
