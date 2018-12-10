package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionsExercise {
    private final static List<String> ENTRY_ELEMENTS = Arrays.asList("apple", "orange", "grapes", "cherry", "strawberry");
    private final static String[] KEY_VALUES = ENTRY_ELEMENTS.toArray(new String[0]);


    public static void main(final String[] args) {
        testSortedSet(ENTRY_ELEMENTS);
        testLinkedList(ENTRY_ELEMENTS);
        testBlockingQueue(ENTRY_ELEMENTS);
        testDeque(ENTRY_ELEMENTS);
        testMap(KEY_VALUES);
    }

    private static void testSortedSet(final List<String> s){
        SortedSet<String> stringTreeSet = new TreeSet<>(s);
        System.out.println("Tree Set before loop: " + stringTreeSet);
        for(String word : stringTreeSet){
            System.out.println(word); // elements are automatically sorted
        }

    }

    private static void testLinkedList(final List<String> s){
        List<String> stringLinkedList = new LinkedList<>(s);
        stringLinkedList.add(0, "mango");
        System.out.println("Linked List: " + stringLinkedList);
    }

    private static void testBlockingQueue (final List<String> s){
        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(20, true, s);
        try{
             arrayBlockingQueue.put("watermelon");
             arrayBlockingQueue.take(); // retrieve and remove element from the head
        } catch (InterruptedException e) {
            e.printStackTrace(); //  method will block if the queue is full, waiting for space to become available,
            // it will throw InterruptedException if the current thread is interrupted.
        }
        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);
    }

    private static void testDeque(final List<String> s){
        Deque<String> stringDeque = new ArrayDeque<>(s);
        stringDeque.addFirst("melon");
        stringDeque.addLast("pear");
        System.out.println("Deque: " + stringDeque);
    }

    private static void testMap(final String[] keyValue){
        SortedMap<String, Integer> treeMap = new TreeMap<>();
        for(int i = 0; i < keyValue.length; i++){
            treeMap.put(keyValue[i], i);
        }
        System.out.println("Tree Map: " + treeMap);
        treeMap.entrySet().removeIf(k -> k.getKey().equals("apple"));
        System.out.println("After loop: " + treeMap);
    }
}
