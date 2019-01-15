package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationCollectionExercise {
    public static void main(final String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        final Enumeration<String> enumeration = Collections.enumeration(list);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        final ArrayList<String> arrayNewList = Collections.list(enumeration);
        System.out.println("List elements: " + list);
    }
}
