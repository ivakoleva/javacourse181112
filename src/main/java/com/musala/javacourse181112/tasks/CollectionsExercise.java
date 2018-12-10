package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionsExercise {
    private final static List<String> ENTRY_ELEMENTS = Arrays.asList("apple", "orange", "grapes", "cherry", "strawberry");
    private final static String[] KEY_VALUES = ENTRY_ELEMENTS.toArray(new String[0]);

    public static void main(final String[] args) {
        testSortedSet();
        testLinkedList();
        testBlockingQueue();
        testDeque();
        testMap();
    }

    private static void testSortedSet() {
        final SortedSet<String> stringTreeSet = new TreeSet<>(ENTRY_ELEMENTS);
        System.out.println("Tree Set before loop: " + stringTreeSet);
        for (String word : stringTreeSet) {
            System.out.println(word); // elements are automatically sorted
        }
    }

    private static void testLinkedList() {
        final List<String> stringLinkedList = new LinkedList<>(ENTRY_ELEMENTS);
        stringLinkedList.add(0, "mango");
        System.out.println("Linked List: " + stringLinkedList);
    }

    private static void testBlockingQueue() {
        final BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(20, true, ENTRY_ELEMENTS);
        try {
            arrayBlockingQueue.put("watermelon");
            arrayBlockingQueue.take(); // retrieve and remove element from the head
        } catch (InterruptedException e) {
            e.printStackTrace(); //  method will block if the queue is full, waiting for space to become available,
            // it will throw InterruptedException if the current thread is interrupted.
        }
        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);
    }

    private static void testDeque() {
        final Deque<String> stringDeque = new ArrayDeque<>(ENTRY_ELEMENTS);
        stringDeque.addFirst("melon");
        stringDeque.addLast("pear");
        System.out.println("Deque: " + stringDeque);
    }

    private static void testMap() {
        final SortedMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < KEY_VALUES.length; i++) {
            treeMap.put(KEY_VALUES[i], i);
        }
        System.out.println("Tree Map: " + treeMap);
        treeMap.entrySet().removeIf(k -> k.getKey().equals("apple"));
        System.out.println("After loop: " + treeMap);
    }
}
