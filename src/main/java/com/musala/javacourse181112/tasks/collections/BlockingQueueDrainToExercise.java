package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDrainToExercise {
    public static void main(String[] args) {
        final Collection<String> collection = new ArrayList<>();
        final BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

        blockingQueue.offer("sha");
        blockingQueue.offer("la");
        blockingQueue.offer("La");
        blockingQueue.offer("i");
        blockingQueue.offer("shy");
        blockingQueue.offer("be");
        blockingQueue.offer("happy");
        blockingQueue.offer("or");
        blockingQueue.offer("just");
        blockingQueue.offer("sad");

        System.out.println(blockingQueue);

        blockingQueue.drainTo(collection, 5);
        System.out.println("Collection: " + collection);

    }
}
