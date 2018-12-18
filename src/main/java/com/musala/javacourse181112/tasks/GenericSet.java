package com.musala.javacourse181112.tasks;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {
    public static void main(String[] args) {
        Set<Number> numberSet = new HashSet<>();
        numberSet.add(2);
        numberSet.add(3L);
        numberSet.add((short) 6);
        numberSet.add(432.65);
        numberSet.add(52.45F);
        numberSet.forEach(i -> System.out.println(i));
    }
}
