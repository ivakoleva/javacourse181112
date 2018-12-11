package com.musala.javacourse181112;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class CollectionsExercise {
    private final static List<String> ENTRY_ELEMENTS = Arrays.asList("bmw", "mercedes", "opel");
    private final static String[] KEY_VALUES = ENTRY_ELEMENTS.toArray(new String[0]);


    public static void main(final String[] args) {
        setTest(ENTRY_ELEMENTS);
        linkedListTest(ENTRY_ELEMENTS);
        dequeTest(ENTRY_ELEMENTS);
        mapTest(KEY_VALUES);

    }

    private static void setTest(final List<String> s) {
        final Set<String> stringSet = new HashSet<>(s);

        for(String word : stringSet){
            System.out.println(word);
        }

    }

    private static void linkedListTest(final List<String> s){
        List<String> stringLinkedList = new LinkedList<>(s);
        stringLinkedList.add(0, "renault");
        System.out.println("Linked List: " + stringLinkedList);
    }


    private static void dequeTest(final List<String> s){
        Deque<String> stringDeque = new ArrayDeque<>(s);
        stringDeque.addFirst("truck");
        stringDeque.addLast("car");
        System.out.println("Deque: " + stringDeque);
    }

    private static void mapTest(final String[] keyValue){
        SortedMap<String, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < keyValue.length; i++){
            treeMap.put(keyValue[i], i);
        }
        System.out.println("Tree Map: " + treeMap);
        treeMap.entrySet().removeIf(k -> k.getKey().equals("bmw"));
        System.out.println("After loop: " + treeMap);
    }

}
