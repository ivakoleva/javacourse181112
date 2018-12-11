package com.musala.javacourse181112.collections;

import java.util.*;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class ConvenienceImplementationsExample {
    public static void main(final String[] args) {
        //final int[] intArray = {1, 2, 3};
        final List<Integer> integerList = Arrays.asList(1, 2, 3);

        final Collection<String> asdCollection = Collections.nCopies(10, "asd");

        // SINGLETON
        // unmodifiable, one-liner instantiation & population
        final List<String> stringSingletonList = Collections.singletonList("Asd");
        // stringSingletonList.add("Asdasd"); <- UnsupportedOperationException

        final Set<String> stringSingletonSet = Collections.singleton("Asd");
        final Map<Integer, String> stringSingletonMap = Collections.singletonMap(1, "Asd");

        // empty collection, unmodifiable
        final List<String> emptyList = Collections.emptyList();
        //...

        Collections.shuffle(integerList);
        Collections.sort(integerList);

        final List<String> stringList = Arrays.asList("asd", "asdf", "sdf");
        final int elementFoundPosition = Collections.binarySearch(stringList, "asd");

        final int min = Collections.min(integerList);
        final int max = Collections.max(integerList);
    }

    private static Collection<String> instantiateCollection() {
        /*final Collection<String> collection = new ArrayList<>();
        collection.add("asd");
        return Collections.unmodifiableCollection(collection);*/

        return Collections.singletonList("Asd");
    }
}
