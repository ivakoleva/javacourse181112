package com.musala.javacourse181112.tasks;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    private final static Set<?> GENERIC_SET = new HashSet<>();
    private final static Set<Number> NUMBER_SET = new HashSet<>();

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        NUMBER_SET.add(2);
        NUMBER_SET.add(3.14);
        NUMBER_SET.add((short) 3.1);
        NUMBER_SET.add(3L);
        System.out.println(NUMBER_SET);

        final Set<?> set1 = copy(GENERIC_SET, NUMBER_SET);
        System.out.println(set1);
    }

    private static <T> Set<T> copy(final Set<T> source, final Set<? extends Number> destination) {
        destination.forEach(n -> source.add((T) n));
        return source;
    }
}
