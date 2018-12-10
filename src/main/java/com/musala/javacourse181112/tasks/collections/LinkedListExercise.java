package com.musala.javacourse181112.tasks.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {
    public static void main(final String[] args) {
        final List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("a");
        stringLinkedList.add("b");
        stringLinkedList.add("c");
        stringLinkedList.add("d");
        stringLinkedList.add("e");
        stringLinkedList.add("f");
        System.out.println("The LinkedList is: " + System.lineSeparator() + stringLinkedList);

        System.out.println("The size of LinkedList is: " + stringLinkedList.size());

        stringLinkedList.remove(2);
        stringLinkedList.remove("e");
        ((LinkedList<String>) stringLinkedList).removeFirst();
        ((LinkedList<String>) stringLinkedList).removeLast();
        System.out.println("The LinkedList after deletion: " + System.lineSeparator() + stringLinkedList);

        System.out.println("The size of LinkedList after deletion is: " + stringLinkedList.size());

        System.out.println("The element with index 1 is: " + stringLinkedList.get(1));

        stringLinkedList.set(1, "c");

        if (!stringLinkedList.contains("a")) {
            ((LinkedList<String>) stringLinkedList).addFirst("a");
        }

        System.out.println("The LinkedList after processing: ");
        final Iterator<String> iterator = stringLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
