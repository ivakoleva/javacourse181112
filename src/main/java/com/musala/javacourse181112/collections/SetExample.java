package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetExample {
    public static void main(String[] args) {
        final Set<String> stringSet = new HashSet<>();
        stringSet.add("asd");
        stringSet.add("asd");
        stringSet.add("asdf");
        System.out.println(stringSet.size());

        IntStream.range(0, 10).boxed()
                .map(i -> "asd")
                .collect(Collectors.toCollection(
                        (Supplier<Collection<String>>) () -> new ArrayList<>()));

    }
}
