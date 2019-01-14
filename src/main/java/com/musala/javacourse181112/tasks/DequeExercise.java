package com.musala.javacourse181112.tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// TODO: code reformat all; final usage; maybe a common package (collection);
public class DequeExercise {
    public static void main(final String[] args) {
        arrayDeque();
        linkedList();
    }

    private static void arrayDeque() {
        final Deque<Integer> integerDeque = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                integerDeque.offerFirst(i);
            } else {
                integerDeque.offerLast(i);
            }
        }
        final Iterator<Integer> integerDequeIterator = integerDeque.iterator();
        for (; integerDequeIterator.hasNext(); ) {
            if (integerDequeIterator.next() >= 4) {
                integerDequeIterator.remove();
            }
        }
    }

    private static void linkedList() {
        final Deque<Integer> integerDeque = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                integerDeque.offerFirst(i);
            } else {
                integerDeque.offerLast(i);
            }
        }
        final Iterator<Integer> integerDequeIterator = integerDeque.iterator();
        for (; integerDequeIterator.hasNext(); ) {
            if (integerDequeIterator.next() <= 4) {
                integerDequeIterator.remove();
            }
        }
    }
}
