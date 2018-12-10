package com.musala.javacourse181112.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExercise {
    public static void main(final String[] args) {
        final Deque<Integer> integerArrayDeque = new ArrayDeque<>();
        for (int i = 1; i < 10; i++) {
            integerArrayDeque.add(i);
        }
        integerArrayDeque.offerFirst(0);
        integerArrayDeque.offerLast(10);

        System.out.println("Is the dequeue is empty: " + integerArrayDeque.isEmpty());

        System.out.println("The ArraysDeque is: " + System.lineSeparator() + integerArrayDeque);

        System.out.println("The size of the ArrayDeque is: " + integerArrayDeque.size());

        System.out.println("The first element is: " + integerArrayDeque.peekFirst());
        System.out.println("The last element is: " + integerArrayDeque.peekLast());

        System.out.println("Does the dequeue contain 5: " + integerArrayDeque.contains(5));

        System.out.println("Remove element " + integerArrayDeque.pop());

        System.out.println("The dequeue after processing:" + System.lineSeparator() + integerArrayDeque);

        System.out.println("First element of the dequeue after processing: " + integerArrayDeque.peek());
    }
}
