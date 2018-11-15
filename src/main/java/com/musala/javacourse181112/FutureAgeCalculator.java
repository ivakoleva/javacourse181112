package com.musala.javacourse181112;

public class FutureAgeCalculator {
    public static void main(String[] args) {
        System.out.println("The age that you inputted is " + Integer.parseInt(args[0]));

        System.out.println("The age that you want to add is " + Integer.parseInt(args[1]));
        int add = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Your future age is " + add);
        System.exit(0);
    }
}
