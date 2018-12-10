package com.musala.javacourse181112.tasks.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QueueExercise {
    public static void main(final String[] args) {
        // TODO: provide supplier on collect(), for reference: HashSetExercise
        final Queue<Integer> integerQueue = new LinkedList<>(IntStream.range(0, 10).boxed().collect(Collectors.toSet()));
        integerQueue.add(9);

        System.out.println("Is the queue is empty: " + integerQueue.isEmpty());

        System.out.println("Elements of the queue: " + System.lineSeparator() + integerQueue);
        System.out.println("Size of the queue: " + integerQueue.size());

        System.out.println("The first element is: " + integerQueue.element());

        System.out.println("Does the queue contain 5: " + integerQueue.contains(5));

        System.out.println("Remove element " + integerQueue.remove());
        System.out.println("The queue after processing:" + System.lineSeparator() + integerQueue);

        System.out.println("First element of the queue after processing: " + integerQueue.peek());
    }
}
