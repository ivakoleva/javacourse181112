package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LoopsExercise {
    public static void main(final String[] args) {
        final List<Integer> myList = new ArrayList<>();
        final String[] loopable = new String[10];
        for (int i = 0; i < loopable.length; i++) {
            loopable[i] = String.valueOf(i);
        }
        myList.add(0);
        myList.add(1);
        myList.add(2);
        Arrays.stream(loopable).forEach(System.out::println);

        // could be iterator() as well
        final ListIterator<Integer> listIterator = myList.listIterator();
        System.out.println(System.lineSeparator()); // println() is system new line itself
                                                    // OS-agnostic line separator would be dynamically retrieved

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            if (listIterator.next() % 2 == 0) {
                listIterator.remove();
            }
        }
    }
}
