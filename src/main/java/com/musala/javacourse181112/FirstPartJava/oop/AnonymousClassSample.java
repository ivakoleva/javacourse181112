package com.musala.javacourse181112.FirstPartJava.oop;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class AnonymousClassSample {
    public static void main(final String[] args) {
        final Runnable myRunnable = new MyRunnable();
        final Runnable myRunnable1 = new MyRunnable();

        /*final Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
               System.out.println("asd");
            }
        };*/
        final Runnable anonymousRunnable = () -> System.out.println("asd");
        final Runnable anonymousRunnable1 = () -> System.out.println("asd");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("asd");
    }
}