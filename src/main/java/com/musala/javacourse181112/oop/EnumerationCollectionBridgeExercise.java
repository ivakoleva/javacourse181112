package com.musala.javacourse181112.oop;

import java.util.*;

public class EnumerationCollectionBridgeExercise {
    /*
     *** create a collection, transform it to enumeration
     *** transform enumeration to collection
     *** loop over an enumeration, then print to stdout
     */

    public static void main(String[] args) {
        final List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(i);
        }

        final Enumeration<Integer> integerEnumeration = Collections.enumeration(integerList);
        while (integerEnumeration.hasMoreElements()) {
            System.out.print(integerEnumeration.nextElement());
        }

        final List<Integer> newIntegerList = Collections.list(integerEnumeration);
        while (integerEnumeration.hasMoreElements()) {
            newIntegerList.add(integerEnumeration.nextElement());
        }
    }

}
