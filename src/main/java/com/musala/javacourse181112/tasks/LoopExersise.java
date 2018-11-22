package com.musala.javacourse181112.tasks;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopExersise {
    public static void main(final String[] args) {
        //usingWhile();
        //usingDoWhile();
        //usingFor();
        //usingForEach();
        usingLambdaAndIterator();
    }

    public static void usingWhile() {
        int[] ar = new int[4];
        int i = 0;
        while (i < ar.length) {
            ar[i] = i;
            i++;
        }
        i = 0;
        while (i < ar.length) {
            System.out.println(ar[i]);
            i++;
        }

    }

    public static void usingDoWhile() {
        int[] ar = new int[4];
        int i = 0;
        do {
            ar[i] = i;
            i++;
        } while (i < ar.length);
        i = 0;
        do {
            System.out.println(ar[i]);
            i++;
        } while (i < ar.length);
    }

    public static void usingFor() {
        int[] ar = new int[4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public static void usingForEach() {
        Integer[] ar = new Integer[4];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = i;
        }
        for (int i1 : ar) {
            System.out.println(i1);
        }
    }

    public static void usingLambdaAndIterator() {
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            int e = iterator.next();
            if (e % 2 == 0) {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
    }
}
    