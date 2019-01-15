package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationCollectionExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Enumeration enumeration = Collections.enumeration(list);

        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());

        ArrayList<String> arrayNewList = Collections.list(enumeration);
        System.out.println("List elements: " + list);
    }
}
