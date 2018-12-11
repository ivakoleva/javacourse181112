package com.musala.javacourse181112.collections;

import java.util.*;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class UnmodifiableWrappersExample {
    public static void enlistUnmodifiableWrappers() {
        final Collection<?> unmodifiableCollection = Collections.unmodifiableCollection(new ArrayList<>());
        final List<?> unmodifiableList = Collections.unmodifiableList(new ArrayList<>());
        final Set<?> unmodifiableSet = Collections.unmodifiableSet(new HashSet<>());
        final Map<?, ?> unmodifiableMap = Collections.unmodifiableMap(new HashMap<>());
        //...
    }

    public static void main(final String[] args) {
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        final List<Integer> unmodifiableIntegerList = Collections.unmodifiableList(integerList);

        // will throw an exception if method attempts to modify the collection
        createReport(unmodifiableIntegerList);

        integerList.add(3);
        System.out.println("Post- createReport (and addition of an element):");
        integerList.forEach(System.out::println);
    }

    private static void createReport(final List<Integer> data) {
        data.forEach(System.out::println);

        // expected to be allowed to read for report only
        //data.remove(0);
    }
}
