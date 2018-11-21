package com.musala.javacourse181112;

public class Loops {
    public static void main(String[] args) {
        loopForEach();
        loopDoWhile();
        loopWhile();
        loopFor();
    }

    public static void loopForEach() {
        final int[] intArray = {1, 2, 3};

        for (int element : intArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void loopDoWhile() {
        int i = 0;
        int n = 5;
        int[] array = new int[n];

        do {
            array[i] = i;
            i++;
        }while (i < n);
        i = 0;

        do {
            System.out.println(array[i]);
            i++;
        }while (i < n);

        System.out.println();

    }

    public static void loopWhile() {
        int i = 0;
        int n = 5;
        int[] array = new int[n];

        while (i < n) {
            array[i] = i;
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.println(array[i]);
            i++;
        }

        System.out.println();

    }

    public static void loopFor() {
        int n = 5;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
    }
}
