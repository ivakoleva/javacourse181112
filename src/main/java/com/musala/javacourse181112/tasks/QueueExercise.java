package com.musala.javacourse181112.tasks;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            integerQueue.offer(i);
        }
        Iterator<Integer> integerPriorityQueueIterator = integerQueue.iterator();
        for (; integerPriorityQueueIterator.hasNext(); ) {
            if (integerPriorityQueueIterator.next() == 3) {
                integerPriorityQueueIterator.remove();
            }
        }
    }
}
