package com.musala.javacourse181112.ForFun;

public class LambdaExample {
    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        // Run em!
        r1.run();
        r2.run();

    }
}

