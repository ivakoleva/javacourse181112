package com.musala.javacourse181112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// good
public class Loops {
    public static void main(final String[] args) {
       /* loopForEach();
        loopDoWhile();
        loopWhile();
        loopFor();*/
        lambdaStream();
        iteratorLooping();
    }

    public static void iteratorLooping() {
        final List<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);

        final Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            final Integer element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }

    public static void lambdaStream() {
        final int[] intArray = {1, 2, 3};
        Arrays.stream(intArray).forEach(System.out::println);
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
        final int[] array = new int[n];

        do {
            array[i] = i++;
            //i++;
        } while (i < n);
        i = 0;

        do {
            System.out.println(array[i++]);
            //i++;
        } while (i < n);

        System.out.println();
    }

    public static void loopWhile() {
        int i = 0;
        int n = 5;
        final int[] array = new int[n];

        while (i < n) {
            array[i] = i++;
            //i++;
        }

        i = 0;
        while (i < n) {
            System.out.println(array[i++]);
            //i++;
        }

        System.out.println();
    }

    public static void loopFor() {
        int n = 5;
        final int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
    }
}
