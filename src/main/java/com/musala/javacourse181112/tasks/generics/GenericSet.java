package com.musala.javacourse181112.tasks.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    public static void main(final String[] args) {
        final Set<? super Number> genericSet = new HashSet<>();
        //final Set<? super Object> genericSet = new HashSet<>();
        genericSet.add(10);
        genericSet.add(11L);
        genericSet.add(20f);
        genericSet.add(15);
        genericSet.add((short) 5);
        //genericSet.add("Hello");

        System.out.println(genericSet);
    }
}
