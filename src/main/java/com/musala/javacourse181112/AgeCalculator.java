package com.musala.javacourse181112;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        int age, years;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        age=scanner.nextInt();
        System.out.print("Enter time period in years:");
        years=scanner.nextInt();
        System.out.println("After "+years+" years you will be "+(age+years)+" old.");
    }
}
