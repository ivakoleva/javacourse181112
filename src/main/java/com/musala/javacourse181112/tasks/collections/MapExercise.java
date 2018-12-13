package com.musala.javacourse181112.tasks.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        final Map<Integer, Double> unsortedMap = new HashMap<>();
        unsortedMap.put(10, 13.55);
        unsortedMap.put(5, 9743.11);
        unsortedMap.put(7, 0.179);
        unsortedMap.put(2, 3.56);

        System.out.println("Map sorted by keys: " + unsortedMap);

//        Map <Integer, Double> sortedValuesMap = new TreeMap();
//        sortedValuesMap.putAll(unsortedMap);
//        System.out.println("Map sorted by values: " + sortedValuesMap);

        Stream<Map.Entry<Integer, Double>> sortedByValuesMap = unsortedMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue());

        System.out.println("Map sorted by values: ");
        sortedByValuesMap.forEach(System.out::println);

        Stream<Map.Entry<Integer, Double>> sortedByEntries = unsortedMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        System.out.println("Map sorted by entries: ");
        sortedByEntries.forEach(System.out::println);
    }
}
