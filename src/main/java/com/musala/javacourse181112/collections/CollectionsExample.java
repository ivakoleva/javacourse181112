package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionsExample {
    public static void main(final String[] args) {
        final Collection<String> collection = new ArrayList<>();
        ((ArrayList<String>) collection).add("asd");
        ((ArrayList<String>) collection).add("asdf");

//        final String[] elements = (String[]) collection.toArray(); // cast the ArrayList to string
        Arrays.stream(collection.toArray());
        final String[] elements1 = collection.toArray(new String[0]);

//        System.out.println("elements: ");
//        Arrays.stream(elements).forEach(System.out::println);

        System.out.println("elements1: ");
        Arrays.stream(elements1).forEach(System.out::println);

    }
}
