package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExercise {
    private final static List<String> ENTRY_ELEMENTS = Arrays.asList("apple", "orange", "grapes", "cherry", "strawberry");
    public static void main(String[] args) {
        testBlockingQueue();
    }

    private static void testBlockingQueue() {
        final BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(20, true, ENTRY_ELEMENTS);
        final List<String> stringList = new ArrayList<>();
        try {
            arrayBlockingQueue.put("watermelon");
            arrayBlockingQueue.take(); // retrieve and remove element from the head
        } catch (InterruptedException e) {
            e.printStackTrace(); //  method will block if the queue is full, waiting for space to become available,
            // it will throw InterruptedException if the current thread is interrupted.
        }
        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);
        arrayBlockingQueue.drainTo(stringList);
        System.out.println("Drained elements to list : " + stringList);
    }
}
