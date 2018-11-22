package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopsExercise {
    public static final int ARRAY_LENGTH = 5;

    public static void main(final String[] args) {
        usingLambdaStreamForEach();


    }

    public static void usingWhile() {
        int[] array = new int[ARRAY_LENGTH];
        int i = 0;
        while (i <= ARRAY_LENGTH) {
            array[i] = i;
            i++;
        }
        System.out.println(array);
    }

    public static void usingDoWhile() {
        int[] array = new int[ARRAY_LENGTH];
        int i = 0;
        do {
            array[i] = i;
            i++;
        }
        while (i <= ARRAY_LENGTH);
    }

    public static void usingFor() {
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i <= ARRAY_LENGTH; i++) {
            array[i] = i;
        }

    }

//    public static void usingForEach() {
//        int[] array = new int[ARRAY_LENGTH];
//        int k = 0;
//        for (int i : array[k]);
//    }

    public static void usingLambdaStreamForEach() {
        final List<String> myList = new ArrayList<>();
        myList.add("smile");
        myList.add("snow");
        myList.add("sunny");
        myList.add("sad");
        myList.add("happy");

        System.out.println("Current array list is: " + myList);

        final Iterator<String> iterator = myList.iterator();
//        myList.forEach(i -> myList.remove(i));
        for (int i = 0; i < myList.size(); i++) {
            if (i % 2 == 0) {
                myList.remove(i);
            }
        }

        System.out.println("Array list after changes: " + myList);


    }
}
