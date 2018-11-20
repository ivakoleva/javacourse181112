package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 20.11.2018
 */
public class LoopsExample {
    public static void main(final String[] args) throws InterruptedException {

        while(true) {
            System.out.println("Hi");
            Thread.sleep(1000 * 5); // 1 second == 1000 ms
        }
    }
}
