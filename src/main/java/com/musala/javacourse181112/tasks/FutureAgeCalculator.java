package com.musala.javacourse181112.tasks;

public class FutureAgeCalculator {

    public static void main(String[] args) {

        int result = calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.println("Your current age is: " + args[0] + " years and after " + args[1] +
                " years you will be " + result + " years old");

        System.exit(0);
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

}
