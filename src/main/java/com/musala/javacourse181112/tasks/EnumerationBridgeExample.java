package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EnumerationBridgeExample {

    public static void main(String[] args) {
        Collection<Integer> integerCollection = IntStream.range(0,10).boxed().collect(Collectors.toCollection(ArrayList::new));
        Enumeration<Integer> integerEnumeration = Collections.enumeration(integerCollection);

        while (integerEnumeration.hasMoreElements()){
            System.out.println(integerEnumeration.nextElement());
        }
    }
}
