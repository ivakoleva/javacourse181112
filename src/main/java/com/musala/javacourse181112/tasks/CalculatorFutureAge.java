package com.musala.javacourse181112.tasks;

public class CalculatorFutureAge {
    public static void main(final String[] args) {
        int index = 0;
        int age = 0;
        while (index < args.length){
            age += Integer.parseInt(args[index]);
            index++;
        }
        System.out.println("The future age is: " + age);
    }
}
