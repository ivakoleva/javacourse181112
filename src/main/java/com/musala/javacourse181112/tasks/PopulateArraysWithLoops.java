package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class PopulateArraysWithLoops {

    public static Scanner SC = new Scanner(System.in);
    public static final int INDEX = SC.nextInt();
    public static int i = 0;
    public static int[] intArr = new int[INDEX];


    public static void main(final String[] args) {
        System.out.println("elements: ");
        whileArray(INDEX);
//        doWhileArray(INDEX);
//        forArray(INDEX);
//        forEachArray(INDEX); // Doesn't work
    }

    // Fill with while
    public static int[] whileArray(int s) {
        while (i < s) {
            intArr[i] = i;
            System.out.println(intArr[i]);
            i++;
        }
        return intArr;
    }

    // Fill with do-while
    public static int[] doWhileArray(int s) {
        do {
            intArr[i] = i;
            System.out.println(intArr[i]);
            i++;

        } while (i < s);
        return intArr;
    }

    // FIll with for
    public static int[] forArray(int s) {
        for (int j = 0; j < s; j++) {
            intArr[j] = j;
            System.out.println(intArr[j]);
        }
        return intArr;
    }

    public static int[] forEachArray(int s) {
        for (int i : intArr) {
            intArr[i] = i;
            System.out.println(intArr[i]);
            ++i;
            System.out.println(i);
        }
        return intArr;
    }
}

