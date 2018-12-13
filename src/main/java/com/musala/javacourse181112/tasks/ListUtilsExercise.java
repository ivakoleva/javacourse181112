package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// nice
public class ListUtilsExercise {
    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        // print list
        integerList.forEach(System.out::println);
        System.out.println();

        // shuffle list
        Collections.shuffle(integerList);
        integerList.forEach(System.out::println);
        System.out.println();

        // sort list
        Collections.sort(integerList);
        integerList.forEach(System.out::println);
        System.out.println();

        // reverse list
        Collections.reverse(integerList);
        integerList.forEach(System.out::println);
        System.out.println();

        // populate a second list
        final List<Integer> integerList2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList2.add(100);
        }

        // concatenate lists
        final List<Integer> integerList3 = new ArrayList<>(integerList);
        integerList3.addAll(integerList2);
        integerList3.forEach(System.out::println);
    }
}
