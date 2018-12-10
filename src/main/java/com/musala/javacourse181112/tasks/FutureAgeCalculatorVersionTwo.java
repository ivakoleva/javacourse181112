package com.musala.javacourse181112.tasks;

public class FutureAgeCalculatorVersionTwo {

    public static void main(final String[] args) {

        int index = 0;
        int sum = 0;

        while (index < args.length){
            sum = sum + Integer.parseInt(args[index]);
            index++;
        }
        System.out.println("Sum is " + sum);
    }
}
