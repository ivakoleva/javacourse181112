package com.musala.javacourse181112.tasks.Collections;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//** BlockingQueue drainTo Exercise
//        *** instantiate a collection, then populate with 5 of 10 queue elements
public class BlockingQueueExercise {
    public static void main(String[] args) {
        final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 10; i++) {
            blockingQueue.offer(i);
        }
        final ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);
        blockingQueue.drainTo(queue, 5);
        System.out.println("BlockingQueue: ");
        blockingQueue.forEach(i -> System.out.println(i + " "));
        System.out.println(System.lineSeparator() + "ArrayQueue: ");
        queue.forEach(i -> System.out.println(i + " "));
        System.out.println();


    }
}
