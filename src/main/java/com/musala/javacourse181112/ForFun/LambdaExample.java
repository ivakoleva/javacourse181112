package com.musala.javacourse181112.ForFun;

public class LambdaExample {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        // Run em!
        r2.run();

    }
}

