package com.musala.javacourse181112.collections;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionsExample {
    public static void main(String[] args) {
        final Collection<String> collection = new ArrayList<>();
        collection.add("asd");
        collection.add("asd1");

//        collection.remove("asd1");
//        collection.remove("aaa");

        final Collection<String> collection1 = new HashSet<>();
        collection1.add("asd");
        collection1.add("asd1");
        collection1.add("asd2");

//        System.out.println(collection1.containsAll(collection));
//        System.out.println(collection.containsAll(collection1));

//        collection.addAll(collection1);
//        collection.forEach(System.out::println);

        // TODO
        /*collection.addAll(collection1);
        collection.forEach(System.out::println);*/

//        collection1.clear();
//        collection1.forEach(System.out::println);

//        final String[] elements = new String[collection.size()];
//        final AtomicInteger atomicInteger = new AtomicInteger(0);
//        Arrays.stream(collection.toArray()).
//                forEach(s -> elements[atomicInteger.getAndIncrement()] = (String) s);
//        final String[] elements1 = collection.toArray(new String[0]);
//
//        System.out.println("elements:");
//        Arrays.stream(elements).forEach(System.out::println);
//
//        System.out.println();


    }
}
