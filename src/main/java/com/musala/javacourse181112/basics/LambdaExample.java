package com.musala.javacourse181112.basics;

import java.util.Arrays;

public class LambdaExample {
    public static void main(final String[] args) {
        final MyRunnable myRunnable = new MyRunnable();
        myRunnable.test();
        myRunnable.run();

        final Runnable myRunnableAnnonymous = new Runnable() {
            @Override
            public void run() {

            }
        };
        final Runnable myRunnableAnonymous = () -> System.out.println("run");

        int[] intArray = {1, 2, 3};
//        Arrays.stream(intArray).forEach(i -> {
//            System.out.println("Print element from intArray");
//            System.out.println(i);
//        });
        Arrays.stream(intArray).forEach(System.out::println);
    }
}

class MyRunnable implements Runnable {
    public void test() {
        System.out.println("Test.");

    }

    @Override
    public void run() {
        System.out.println("Run.");

    }
}