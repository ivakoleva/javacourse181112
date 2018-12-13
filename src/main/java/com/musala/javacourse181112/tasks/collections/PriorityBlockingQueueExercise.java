package com.musala.javacourse181112.tasks.collections;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PriorityBlockingQueueExercise {
    private static final PriorityBlockingQueue<Integer> INTEGER_PRIORITY_BLOCKING_QUEUE = new PriorityBlockingQueue<>();
    private static final int INTEGER_PRIORITY_BLOCKING_QUEUE_MIN = 1;
    private static final int INTEGER_PRIORITY_BLOCKING_QUEUE_MAX = 100000;

    public static void main(final String[] args) {
        final AtomicInteger producerCounter = new AtomicInteger();
        final AtomicInteger consumerCounter = new AtomicInteger();

        final Thread producerThread = new Thread(() -> {
            final String name = "producer " + producerCounter.getAndIncrement();
            while (!Thread.interrupted()) {
                try {
                    final int value = ThreadLocalRandom.current()
                            .nextInt(INTEGER_PRIORITY_BLOCKING_QUEUE_MIN, INTEGER_PRIORITY_BLOCKING_QUEUE_MAX + 1);
                    System.out.println("Thread [" + name + "] put value: " + value);
                    INTEGER_PRIORITY_BLOCKING_QUEUE.offer(value);
                    Thread.sleep(1000 * 2);
                } catch (InterruptedException ignored) {
                    //ignored.printStackTrace();
                    System.out.println("Producer interrupted: ");
                }
            }
        });

        final Thread consumerThread = new Thread(() -> {
            final String name = "consumer " + consumerCounter.getAndIncrement();
            while (!Thread.interrupted()) {
                try {
                    if (INTEGER_PRIORITY_BLOCKING_QUEUE.isEmpty()) {
                        continue;
                    }
                    System.out.println("Thread [" + name + "]: took value of " +
                            INTEGER_PRIORITY_BLOCKING_QUEUE.take());
                    Thread.sleep(1000 * 2);
                } catch (InterruptedException ignored) {
                    //ignored.printStackTrace();
                    System.out.println("Consumer interrupted");
                }
            }
        });

        final List<Thread> threadList = Stream.concat(
                populateThreadsBiFunction.apply(producerThread, 2).stream(),
                populateThreadsBiFunction.apply(consumerThread, 2).stream())
                .collect(Collectors.toList());

        for (Thread thread : threadList) {
            thread.start();
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.exit(0);
    }//end main()

    private static BiFunction<Runnable, Integer, List<Thread>> populateThreadsBiFunction = (runnable, count) ->
            IntStream.range(0, count).boxed().map(i -> new Thread(runnable)).collect(Collectors.toList());
}
