package com.musala.javacourse181112.tasks.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedListDeque {
    public static void main(final String[] args) {
        final Deque<Integer> integerLinkedList = new LinkedList<>(IntStream.range(1, 10).boxed().map(i -> i).collect(Collectors.toSet()));
        integerLinkedList.offerFirst(0);
        integerLinkedList.offerLast(10);

        System.out.println("Is the dequeue is empty: " + integerLinkedList.isEmpty());

        System.out.println("The LinkedList is: " + System.lineSeparator() + integerLinkedList);

        System.out.println("The size of the LinkedList is: " + integerLinkedList.size());

        System.out.println("The first element is: " + integerLinkedList.peekFirst());
        System.out.println("The last element is: " + integerLinkedList.peekLast());

        System.out.println("Does the dequeue contain 5: " + integerLinkedList.contains(5));

        System.out.println("Remove element " + integerLinkedList.pop());

        System.out.println("The dequeue after processing:" + System.lineSeparator() + integerLinkedList);

        System.out.println("First element of the dequeue after processing: " + integerLinkedList.peek());
    }
}
