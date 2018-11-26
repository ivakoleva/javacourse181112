package com.musala.javacourse181112;

/*
votes v2 +

Loops exercise - for each loop type (while; do-while; for; foreach)
** automatically (using loop), initialize an array with values
* ** print the array to stdout

Votes v0.3 application
*refactor, using loops
*/

import java.util.Scanner;

// Ooki
public class LoopHW {
    public static void main(final String[] args) {
        int n, array[];
        final Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want your array to have?");
        n = input.nextInt();
        array = new int[n];
        System.out.println();

        //for
        inputArrayFor(array, n);
        outputArrayFor(array, n);
        System.out.println();

        //do/while
        inputArrayDo(array, n);
        outputArrayDo(array, n);
        System.out.println();

        //while
        inputArrayWhile(array, n);
        outputArrayWhile(array, n);
        System.out.println();

        //foreach
        inputArrayEach(array, n);
        outputArrayEach(array);

        System.exit(0);
    }

    private static void inputArrayFor(int[] array, int n) {
        int i;
        System.out.println("Please enter " + n + " elements");
        final Scanner input = new Scanner(System.in);
        for (i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
    }

    private static void outputArrayFor(int[] array, int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
        }
    }

    private static void inputArrayDo(int[] array, int n) {
        int i = 0;
        System.out.println("Please enter " + n + " elements");
        final Scanner input = new Scanner(System.in);
        do {
            array[i] = input.nextInt();
            i++;
        } while (i < n);
    }

    private static void outputArrayDo(final int[] array, final int n) {
        int i = 0;
        do {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
            i++;
        } while (i < n);
    }

    private static void inputArrayWhile(final int[] array, final int n) {
        int i = 0;
        System.out.println("Please enter " + n + " elements");
        final Scanner input = new Scanner(System.in);
        while (i < n) {
            array[i] = input.nextInt();
            i++;
        }
    }

    private static void outputArrayWhile(final int[] array, final int n) {
        int i = 0;
        while (i < n) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
            i++;
        }
    }

    private static void inputArrayEach(final int[] array, final int n) {
        System.out.println("Please enter " + n + " elements");
        Scanner input = new Scanner(System.in);
        int i = 0;
        for (int element : array) {
            array[i] = input.nextInt();
            i++;
        }
    }

    private static void outputArrayEach(final int[] array) {
        int i = 0;
        for (int element : array) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
            i++;
        }
    }
}
