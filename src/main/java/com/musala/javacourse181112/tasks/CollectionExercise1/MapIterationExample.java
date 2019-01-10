package com.musala.javacourse181112.tasks.collectionexercise;

import java.util.Map;
import java.util.TreeMap;

public class MapIterationExample {
    public static void main(final String[] args) {
        final Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Platypus1");
        treeMap.put(3, "Platypus3");
        treeMap.put(2, "Platypus2");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
            for (int key : treeMap.keySet()) {
                System.out.println(key);
            }
            for (String value : treeMap.values()) {
                System.out.println(value);
            }

        }
    }

