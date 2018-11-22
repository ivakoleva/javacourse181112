package com.musala.javacourse181112.basics;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
        //System.out.println("Input parameters: " + args[0] + " " + args[1]);
        int counter = 0;
        int age = 0;

        do {
            int user = Integer.parseInt(args[counter++]);
            age = age + user;
        } while (counter < args.length);
        System.out.println("Future age calculated: " + (age));
    }
}
