package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LoopExerciseElaboration {
    public static void main(String[] args) {
        //withWhile();
        //withDoWhile();
        //withFor();
        withForEach();
        withLambaForEach();
    }

    public static void withWhile() {
        int[] array = new int[10];
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
        int[] array = new int[10];
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
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void withForEach() {
        int[] array = new int[10];
        int i = 0;
        for (int i1 : array) {
            array[i] = i;
            i++;
        }
        Arrays.stream(array).forEach(System.out::println);

    }

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
