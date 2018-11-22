package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class PopulateArraysWithLoops {
    static {
        System.out.println("elements: ");
    }

    public static final Scanner SCANNER = new Scanner(System.in);
    public static int[] intArr = new int[SCANNER.nextInt()];

    public static void main(final String[] args) {
        //whileArray();
//        doWhileArray();
//        forArray();
        forEachArray(); // Doesn't work
    }

    // fill using while
    public static void whileArray() {
        int i = 0;
        while (i < intArr.length) {
            intArr[i] = i;
            System.out.println(intArr[i]);
            i++;
        }
    }

    // fill using do-while
    public static void doWhileArray() {
        int i = 0;
        do {
            intArr[i] = i;
            System.out.println(intArr[i]);
            i++;
        } while (i < intArr.length);
    }

    // fill using for
    public static void forArray() {
        int i = 0;
        for (int j = 0; j < intArr.length; j++) {
            intArr[j] = j;
            System.out.println(intArr[j]);
        }
    }

    // fill using for
    public static void forEachArray() {
        int k = 0;
        for (int ignored : intArr) {
            intArr[k] = k;
            k++;
            System.out.println(intArr[k]);
        }
    }
}

