package com.musala.javacourse181112.tasks;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    // Create and populate a generic Set, that supports addition of at least Integer, Long, Short, Double
    public static void main(final String[] args) {
        final Set<? super Number> genericSet = new HashSet<>();
        genericSet.add(13);
        genericSet.add(656596L);
        genericSet.add((short) 33);
        genericSet.add(33.12D);

        System.out.println(genericSet);
    }
}
