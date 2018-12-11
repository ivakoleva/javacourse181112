package com.musala.javacourse181112.collections;

import java.util.*;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class CheckedWrappersExample {
    public static void enlistCheckedWrappers() {
        final Collection<Integer> checkedCollection = Collections.checkedCollection(new ArrayList<>(), Integer.class);
        final List<Integer> checkedList = Collections.checkedList(new ArrayList<>(), Integer.class);
        final Set<Integer> checkedSet = Collections.checkedSet(new HashSet<>(), Integer.class);
        final Map<Integer, Object> checkedMap = Collections.checkedMap(new HashMap<>(), Integer.class, Object.class);
        //...
    }

    public static void main(final String[] args) {
        // raw
        final Collection rawCollection = new ArrayList();
        rawCollection.add(1);
        rawCollection.add("asd");

        // using generics
        final Collection<Integer> integerCollection = new ArrayList<>();
        integerCollection.add(1);

        // using checked wrapper would guarantee
        // type-safe usage of this collection, checking the modification on-spot
        // keeping data types consistency
        addIntegerToCollection(Collections.checkedCollection(integerCollection, Integer.class));

        final Optional<Integer> collectionElementsSumOptional =
                integerCollection.stream().reduce((i1, i2) -> i1 + i2);
        System.out.println("sum:");
        System.out.println(collectionElementsSumOptional.orElse(0));
    }

    private static void addIntegerToCollection(final Collection<Integer> integerCollection) {
        integerCollection.add(1);

        // raw workaround of generic types
        final Collection collection = integerCollection;
        collection.add("String");
    }
}
