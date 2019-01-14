package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 20.11.2018
 */
public class LoopsExample {
    public static void main(final String[] args) throws InterruptedException {

        /*while(true) {
            System.out.println("Hi");
            Thread.sleep(1000 * 5); // 1 generics == 1000 ms
        }*/


        /*do {
            System.out.println("starting again...");
            if(System.currentTimeMillis() % 2 == 0) {
                *//*System.out.println("exiting...");
                return;*//*
                continue;
            }
            System.out.println("will loop.");
            Thread.sleep(1000 * 1);
        } while (true);*/

        //int goto = 1;

       /* while (true) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis % 2 == 0) {
                *//*System.out.println("exiting...");
                return;*//* // exiting the method (and the loop respectively)
                System.out.println("even number: " + currentTimeMillis);
                break; // breaks the loop
                //continue; // continues to next loop, checking condition first
            }
            System.out.println("odd number: " + currentTimeMillis);
            Thread.sleep(1000 * 1);
        }

        System.out.println("out of while loop!");*/

        /*int i = 0;
        outer:
        while(i++ < 10) {
            System.out.println("i: " + i);

            int k = 0;
            //inner:
            while(k++ < 10) {
                if(k == 5) {
                    continue outer;
                }
                System.out.println("    k: " + k);
            }
        }*/

        /*int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

        // forever loop
        /*while(true) {
        }*/
        /*for(;;) {
        }*/

        /*int i = 0;
        for( ; ; i++) {
            if(i >= 10) {
                break;
            }
            System.out.println(i);
        }*/

        final int[] intArray = {1, 2, 3};
        //int i = 0;
        for (int element : intArray) { // foreach; implements Iterable interface
            System.out.println(element);
            //i++;
        }
    }
}
