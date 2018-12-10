package com.musala.javacourse181112.tasks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueueExercise {
    public static void main(final String[] args) {
        final Queue<Integer> queue = new LinkedList<>(IntStream.range(0, 10).boxed().map(i -> i).collect(Collectors.toSet()));
        ((LinkedList<Integer>) queue).add(9);

        System.out.println("Is the queue is empty: " + queue.isEmpty());

        System.out.println("Elements of the queue: " + System.lineSeparator() + queue);
        System.out.println("Size of the queue: " + queue.size());

        System.out.println("The first element is: " + queue.element());

        System.out.println("Does the queue contain 5: " + queue.contains(5));

        System.out.println("Remove element " + queue.remove());
        System.out.println("The queue after processing:" + System.lineSeparator() + queue);

        System.out.println("First element of the queue after processing: " + queue.peek());
    }
}
