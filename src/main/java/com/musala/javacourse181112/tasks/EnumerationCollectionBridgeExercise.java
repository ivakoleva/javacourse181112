package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationCollectionBridgeExercise {

    public static void main(final String[] args) {
        final List <Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        final Enumeration<Integer> integerEnumeration = Collections.enumeration(integerList);

        while (integerEnumeration.hasMoreElements()){
            System.out.println(integerEnumeration.nextElement());
        }

        Collections.list(integerEnumeration);
    }
}
