package com.musala.javacourse181112.tasks;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopsExercise {
    public static final int ARRAY_LENGTH = 5;
    public static final int[] ARRAY = new int[ARRAY_LENGTH];

    public static void main(final String[] args) {
        usingWhile();
        clearTheArray();
        usingDoWhile();
        clearTheArray();
        usingFor();
        clearTheArray();
        usingForEach();
        clearTheArray();
        usingLambdaStreamForEach();
        usingIterator();
    }

    public static void usingWhile() {
        int i = 0;
        while (i < ARRAY_LENGTH) {
            ARRAY[i] = i;
            i++;
        }

        System.out.println("Printing array using while " + Arrays.toString(ARRAY));
    }

    public static void usingDoWhile() {
        int i = 0;

        do {
            ARRAY[i] = i;
            i++;
        }
        while (i < ARRAY_LENGTH);

        System.out.println("Printing array using do - while " + Arrays.toString(ARRAY));
    }

    public static void usingFor() {
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            ARRAY[i] = i;
        }

        System.out.println("Printing array using for " + Arrays.toString(ARRAY));
    }

    public static void usingForEach() {
        int k = 0;
        for (int ignored : ARRAY) {
            ARRAY[k] = k;
            k++;
        }

        System.out.println("Printing array using foreach " + Arrays.toString(ARRAY));
    }

    public static void usingLambdaStreamForEach() {
        final List<String> myList = new ArrayList<>();

        myList.add("smile");
        myList.add("snow");
        myList.add("sunny");
        myList.add("sad");
        myList.add("happy");

        System.out.print("Printing array list using Lambda expression: ");
        myList.forEach(System.out::println);
    }

    public static void usingIterator() {
        final List<String> list = new ArrayList<>();

        list.add("summer");
        list.add("sunny");
        list.add("winter");
        list.add("snow");
        list.add("spring");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if ((iterator.next().length() % 2 == 0)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void clearTheArray() {
        Arrays.fill(ARRAY, 0);
    }
}
