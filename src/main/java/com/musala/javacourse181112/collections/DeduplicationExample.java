package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 13.12.2018
 */
public class DeduplicationExample {
    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        IntStream.range(0, 10).forEach(integerList::add);
        IntStream.range(0, 10).forEach(integerList::add);
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        integerList.add(100);
        integerList.forEach(System.out::println);
        System.out.println();

        // using set
        final Set<Integer> integerSet = new HashSet<>(integerList);
        integerSet.forEach(System.out::println);
        System.out.println();

        // relying on lambda
        integerList.stream().distinct().forEach(System.out::println);
    }
}
