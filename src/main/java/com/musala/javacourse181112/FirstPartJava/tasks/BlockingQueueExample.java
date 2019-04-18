package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    public static void main(final String[] args) {
        //LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(IntStream.range(0,10).boxed().map(i-> i*i).collect(Collectors.toCollection(LinkedBlockingQueue::new)));
        final LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        for (int i = 0; i < 10; i++) {
            if (!blockingQueue.offer(i * i)) {
                System.out.println("no space is currently available.");
            }
        }

        blockingQueue.forEach(System.out::println);

        final List<Integer> newList = new ArrayList<>();
        blockingQueue.drainTo(newList, 7);


        System.out.println("------------");
        newList.forEach(System.out::println);
    }
}
