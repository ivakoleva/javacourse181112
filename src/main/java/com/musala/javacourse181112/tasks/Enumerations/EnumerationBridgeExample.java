package com.musala.javacourse181112.tasks.Enumerations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnumerationBridgeExample {

    public static void main(final String[] args) {
        final Collection<Integer> integerCollection = IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new));
        final Enumeration<Integer> integerEnumeration = Collections.enumeration(integerCollection);

        while (integerEnumeration.hasMoreElements()) {
            System.out.println(integerEnumeration.nextElement());
        }
    }



}
