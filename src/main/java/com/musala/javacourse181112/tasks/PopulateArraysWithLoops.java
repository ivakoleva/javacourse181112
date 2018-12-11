package com.musala.javacourse181112.tasks;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PopulateArraysWithLoops {
    static {
        System.out.println("Enter elements: ");
    }

    public static final Scanner SCANNER = new Scanner(System.in);
    public static int[] intArr = new int[SCANNER.nextInt()];

    public static void main(final String[] args) {
        //whileArray();
//        doWhileArray();
//        forArray();
//        forEachArray(); // Doesn't work
        usingLambdaAndIterator();
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
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            System.out.println(intArr[i]);
        }
    }

    // fill using for-each
    public static void forEachArray() {
        int k = 0;
        for (int ignored : intArr) {
            intArr[k] = k;
            k++;
            System.out.println(intArr[k]);
        }

//        Arrays.stream(intArr).forEach(i -> {
//            intArr[i] = i;
//            System.out.println(intArr[i]);
//        });
//    }
//
//         TODO Implement Iterator
    }

    public static void usingLambdaAndIterator() {

        Arrays.stream(intArr).forEach(i -> {
            for (int j = 0; j <intArr.length ; j++) {
                intArr[j] = j;
                
            }
            System.out.println(intArr[i]);
        });
//        System.out.println(intArr[1]);

//            myList.forEach(i -> myList.set(i, i + 1));
//            Arrays.stream(myList).forEach(System.out::println);

    }
}

