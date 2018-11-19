package com.musala.javacourse181112.tasks;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
        int age = Integer.parseInt(args[0]);
        int addYears = Integer.parseInt(args[1]);

        System.out.println("Age:" + age + "\nAdded Age:" + addYears);
        System.out.println("Result:" + (age + addYears));
        System.exit(0);
    }
}
