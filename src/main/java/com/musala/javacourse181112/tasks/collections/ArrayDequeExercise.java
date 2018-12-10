package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExercise {
    public static void main(final String[] args) {
        final Deque<Integer> integerDeque = new ArrayDeque<>();
        for (int i = 1; i < 10; i++) {
            integerDeque.add(i);
        }
        integerDeque.offerFirst(0);
        integerDeque.offerLast(10);

        System.out.println("Is the dequeue is empty: " + integerDeque.isEmpty());

        System.out.println("The ArraysDeque is: " + System.lineSeparator() + integerDeque);

        System.out.println("The size of the ArrayDeque is: " + integerDeque.size());

        System.out.println("The first element is: " + integerDeque.peekFirst());
        System.out.println("The last element is: " + integerDeque.peekLast());

        System.out.println("Does the dequeue contain 5: " + integerDeque.contains(5));

        System.out.println("Remove element " + integerDeque.pop());

        System.out.println("The dequeue after processing:" + System.lineSeparator() + integerDeque);

        System.out.println("First element of the dequeue after processing: " + integerDeque.peek());
    }
}
