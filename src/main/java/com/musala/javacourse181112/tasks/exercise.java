package com.musala.javacourse181112.tasks;

import java.util.*;

public class exercise {
    public static void main(String[] args) {
        populationArrayList();
        populationLinkedList();
        populationHashset();
        populationTreeSet();
        populationLinkedHashset();
        populationDequeLinkedList();
        populationArrayDeque();
        populationOnMap();

    }

    private static void populationOnMap() {
        final Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("key1", "value1");
        stringStringMap.put("key2", "value2");
        stringStringMap.put("key3", "value3");
        stringStringMap.put("key4", "value4");
        for(int i=0;i<stringStringMap.size();i++){
            System.out.println(stringStringMap);
            if (i>=1){
                stringStringMap.remove("key3","value3");
            }
            System.out.println(stringStringMap);

        }

    }


    private static void populationArrayDeque() {
        final Deque<String>  deque = new ArrayDeque<>();
        deque.add("asd");
        deque.add("asd1");
        deque.add("asd2");
        System.out.println("deque size:" + deque.size());


    }

    private static void populationDequeLinkedList() {
        final Deque<String>  deque = new LinkedList<>();
        deque.add("asd");
        deque.add("asd1");
        deque.add("asd2");


    }

    private static void populationTreeSet() {
        final Collection<String> collection1 = new TreeSet<>();
        collection1.add("asd");
        collection1.add("asd1");
        collection1.add("asd2");

    }

    private static void populationLinkedHashset() {
        final Collection<String> collection1 = new LinkedHashSet<>();
        collection1.add("asd");
        collection1.add("asd1");
        collection1.add("asd2");

    }

    private static void populationHashset() {
        final Collection<String> collection1 = new HashSet<>();
        collection1.add("asd");
        collection1.add("asd1");
        collection1.add("asd2");


    }

    private static void populationLinkedList() {
        final Collection<String> collection = new LinkedList<>();
        collection.add("asd");
        collection.add("List");
        System.out.println( collection.isEmpty());

    }

    private static void populationArrayList() {
        final Collection<String> collection = new ArrayList<>();
        collection.add("asd");
        collection.add("asd1");

    }

}
