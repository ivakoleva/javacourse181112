package com.musala.javacourse181112.homeworks;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityBlockingQueueHomework {
    public static void main(String[] args) {
        final AtomicInteger producerCount = new AtomicInteger();
        final AtomicInteger consumerCount = new AtomicInteger();
        PriorityBlockingQueue<Integer> integerPriorityBlockingQueue = new PriorityBlockingQueue<>();
        int minimal = 1;
        int maximal = 100000;
        Thread producerThread = new Thread(() -> {
            String name = "producer" + producerCount.getAndIncrement();
            while (!Thread.interrupted()) {
                try {
                    int value = ThreadLocalRandom.current().nextInt(minimal, maximal + 1);
                    System.out.println("Thread: " + name + " added value: " + value);
                    integerPriorityBlockingQueue.offer(value);
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                    // InterruptedException is ignored

                    System.out.println("Producer Thread is interrupted!");
                }
            }
        });
        Thread consumerThread = new Thread(() -> {
            String name = "consmer" + consumerCount.getAndIncrement();
            while (!Thread.interrupted()) {
                try {

                    if (integerPriorityBlockingQueue.isEmpty()) {
                        continue;
                    }
                    System.out.println("Thread: " + name + " took value: " + integerPriorityBlockingQueue.take());
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {
                    // InterruptedException is ignored
                    System.out.println("Consumer thread is interrupted!");
                }
            }
        });

        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
