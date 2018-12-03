package com.musala.javacourse181112.basics;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by Iva Koleva on 22.11.2018
 */
public class LambdaExample {
    public static void main(final String[] args) {
        final Runnable myRunnable = new MyRunnable();
        //myRunnable.test();
        myRunnable.run();

        final Runnable myRunnableAnonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run.");
            }
        };

        final Runnable myRunnableAnonymousLambda = () -> System.out.println("Run.");


        final int[] intArray = {1, 2, 3};
        Arrays.stream(intArray).forEach(i -> System.out.println(i + 1));
        Arrays.stream(intArray).forEach(System.out::println);
        final Function<String,StringBuilder> castStringToStringBuilder = (s)->new StringBuilder(s);
        }
}

// default package-protected scope of visibility
class MyRunnable implements Runnable {
    /*public void test() {
        System.out.println("Test.");
    }*/

    @Override
    public void run() {
        System.out.println("Run.");
    }

    /*public static void main(final String[] args) {
    }*/
}
