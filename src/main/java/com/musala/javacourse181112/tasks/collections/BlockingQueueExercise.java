package com.musala.javacourse181112.tasks.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExercise {
    public static void main(final String[] args) {
        final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);
        for (int i = 0; i < 10; i++) {
            blockingQueue.offer(i);
        }

        final List<Integer> integerList = new ArrayList<>();
        blockingQueue.drainTo(integerList, 5);
        System.out.println(integerList);
    }
}
