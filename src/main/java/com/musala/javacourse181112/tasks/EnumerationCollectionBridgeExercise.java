package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class EnumerationCollectionBridgeExercise {
    public static void main(String[] args) {
        final List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        final Enumeration<Integer> integerEnumeration = Collections.enumeration(integerList);
        final List<Integer> integerList1 = new ArrayList<>();

        while (integerEnumeration.hasMoreElements()) {
            integerList1.add(integerEnumeration.nextElement());
        }

        while (integerEnumeration.hasMoreElements()) {
            System.out.println(integerEnumeration.nextElement());
        }

    }
}
