package com.musala.javacourse181112.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class SetExample {
    public static void main(final String[] args) {
        final Set<String> stringSet = new HashSet<>();
        stringSet.add("asd");
        stringSet.add("asd");
        stringSet.add("asd2");
        System.out.println(stringSet.size());


        final Collection<String> stringCollection =
                IntStream.range(0, 10)
                        .boxed()
                        .map(i -> "asd")
                        .collect(Collectors.toList());
        stringCollection.add("asdf");
        stringCollection.add("asdf1");
        stringCollection.add("asdf2");

        System.out.println("stringCollection:");
        stringCollection.forEach(System.out::println);

        System.out.println();
        final Set<String> stringCollectionDeduplicated =
                new HashSet<>(stringCollection);
        System.out.println("stringCollectionDeduplicated:");
        stringCollectionDeduplicated.forEach(System.out::println);

    }
}
