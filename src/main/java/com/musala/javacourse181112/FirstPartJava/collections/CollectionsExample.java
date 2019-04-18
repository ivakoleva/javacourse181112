package com.musala.javacourse181112.FirstPartJava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Iva Koleva on 06.12.2018
 */
public class CollectionsExample {
    public static void main(final String[] args) {
        final Collection<String> collection = new ArrayList<>();
        collection.add("asd");
        collection.add("asd1");

        //collection.remove("asd1");
        //collection.remove("aaa");

        final Collection<String> collection1 = new HashSet<>();
        collection1.add("asd");
        collection1.add("asd1");
        collection1.add("asd2");

        // equality of elements
        System.out.println(collection.containsAll(collection1) && collection1.containsAll(collection));

        /*System.out.println(collection1.containsAll(collection)); // true
        System.out.println(collection.containsAll(collection1)); // false*/

        /*collection1.retainAll(collection);
        collection1.forEach(System.out::println);*/

        /*collection1.removeIf(v -> v.endsWith("1"));
        collection1.forEach(System.out::println);*/

        /*collection1.clear();
        collection1.forEach(System.out::println);*/


        // TODO
        /*collection.addAll(collection1);
        collection.forEach(System.out::println);*/


        /*final String[] elements = new String[collection.size()];
        final AtomicInteger atomicInteger = new AtomicInteger();
        Arrays.stream(collection.toArray())
                .forEach(s -> elements[atomicInteger.getAndIncrement()] = (String) s);
        final String[] elements1 = collection.toArray(new String[0]);

        System.out.println("elements:");
        Arrays.stream(elements).forEach(System.out::println);

        System.out.println("elements1:");
        Arrays.stream(elements1).forEach(System.out::println);

        System.out.println();*/
    }
}
