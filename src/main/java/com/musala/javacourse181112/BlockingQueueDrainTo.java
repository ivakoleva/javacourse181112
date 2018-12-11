package com.musala.javacourse181112;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDrainTo {
    public static void main(String[] args) {
        final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(10);

        for (int i = 0; i < 10; i++){
            blockingQueue.offer(i);
        }

        final List<Integer> integerList = new ArrayList<>();
        blockingQueue.drainTo(integerList,5);
        System.out.println(integerList);

    }

}
