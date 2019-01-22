package com.musala.javacourse181112.homeworks;

import java.util.HashSet;
import java.util.Set;

public class GenericSetHomework {
    private final static Set<?> GENERIC_SET = new HashSet<>();
    private final static Set<Number> NUMBER_SET = new HashSet<>();
    public static void main(String[] args) {
        short shortNumber = 123;
        NUMBER_SET.add(2);
        NUMBER_SET.add(5.1431243123);
        NUMBER_SET.add(shortNumber);
        NUMBER_SET.add(12345L);
        System.out.println(NUMBER_SET);

        Set<? extends Number> NumberSetCopy = new HashSet<>(NUMBER_SET);
        System.out.println(NumberSetCopy);




    }
}
