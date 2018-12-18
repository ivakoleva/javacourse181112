package com.musala.javacourse181112.tasks;

import java.util.*;

public class GenericSet {
    private final static Set<?> GENERIC_SET = new HashSet<>();
    private final static Set<Number> NUMBER_SET = new HashSet<>();

    public static void main(String[] args) {
        NUMBER_SET.add(2);
        NUMBER_SET.add(3.14);
        NUMBER_SET.add((short) 3.1);
        NUMBER_SET.add(3L);
        System.out.println(NUMBER_SET);

        copy(GENERIC_SET, NUMBER_SET);

    }

    private static <T> Set<T> copy (Set<? extends Object> source, Set<? extends Number> destination){
        return new HashSet<>();
    }


}
