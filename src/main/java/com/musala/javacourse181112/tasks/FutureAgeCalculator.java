package com.musala.javacourse181112.tasks;

public class FutureAgeCalculator {
    public static void main(String[] args) {
        System.out.println("Input age: " + args[0]);
        System.out.println("Input period: " + args[1]);
        System.out.println("Age in future: " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
    }
}
