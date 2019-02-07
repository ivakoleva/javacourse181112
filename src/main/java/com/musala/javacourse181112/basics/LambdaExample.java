package com.musala.javacourse181112.basics;

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

    /*public static void PawIncorporated(final String[] args) {
    }*/
}
