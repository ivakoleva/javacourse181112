package com.musala.javacourse181112.tasks.generics;

import java.util.HashSet;
import java.util.Set;
/*

Create and populate a generic Set, that supports addition of at least Integer, Long, Short, Double
 */
public class GenericSet {
    public static void main(String[] args) {
        final Set<Number> genericSet = new HashSet<>();
        genericSet.add(7);
        genericSet.add(12L);
        genericSet.add((short)3);
        genericSet.add(17.3D);
        System.out.println(genericSet);
    }
}