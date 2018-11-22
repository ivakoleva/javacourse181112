package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// clean, nice
public class LoopExerciseElaboration {
    public static void main(final String[] args) {
        //withWhile();
        //withDoWhile();
        //withFor();
        withForEach();
        withLambaForEach();
    }

    public static void withWhile() {
        final int[] array = new int[10];
        int i = 0;
        while (i < array.length
        ) {
            array[i] = i;
            i++;
        }
        i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void withDoWhile() {
        final int[] array = new int[10];
        int i = 0;
        do {
            array[i] = i;
            i++;
        } while (i < array.length);
        i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);
    }

    public static void withFor() {
        final int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void withForEach() {
        final int[] array = new int[10];
        int i = 0;
        for (int i1 : array) {
            array[i] = i;
            i++;
        }
        Arrays.stream(array).forEach(System.out::println);
    }

    // method names would be verbs
    public static void withLambaForEach() {
        final List<String> myList = new ArrayList<>();
        myList.add("asd0");
        myList.add("asd1");
        myList.add("asd2");
        final Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            final String element = iterator.next();
            System.out.println(element);
            if (element.length() % 2 == 0) {
                iterator.remove();
            }
        }
        myList.forEach(System.out::println);
    }
}
