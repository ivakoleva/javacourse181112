package com.musala.javacourse181112.tasks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationCollection {
    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>(); // type safety :)
        for (int i = 1; i <= 3; i++) {
            integerList.add(i);
        }

        final Enumeration<Integer> integerEnumeration = Collections.enumeration(integerList);
        while (integerEnumeration.hasMoreElements()) {
            System.out.println("Value is: " + integerEnumeration.nextElement());
        }

        final List<Integer> integerList1 = Collections.list(integerEnumeration);
    }
}
