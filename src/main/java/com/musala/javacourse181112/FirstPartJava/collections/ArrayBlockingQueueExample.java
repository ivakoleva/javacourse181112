package com.musala.javacourse181112.FirstPartJava.collections;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Iva Koleva on 11.12.2018
 */
public class ArrayBlockingQueueExample {
    private static final BlockingQueue<String> MESSAGES_BLOCKING_QUEUE = new ArrayBlockingQueue<>(10);

    public static void showOldSchoolThreadInstantiation() {
        class ProducerThread extends Thread {
            @Override
            public void run() {
                // TODO
            }
        }

        final Thread producerThread = new ProducerThread();
        //...
    }

    public static void main(final String[] args) {
        // TODO: use TriFunction and pass name, then set Thread.name
        final String producer = "producer";
        final String consumer = "consumer";
        final AtomicInteger producerCounter = new AtomicInteger();
        final AtomicInteger consumerCounter = new AtomicInteger();

        final Runnable producerRunnable = () -> {
            final String name = producer + producerCounter.getAndIncrement();
            while (!Thread.interrupted()) {
                try {
                    System.out.println("Thread [" + name + "] putting...");
                    final long startTimeMillis = System.currentTimeMillis();
                    MESSAGES_BLOCKING_QUEUE.put(name);
                    System.out.println("Thread [" + name + "] managed to put for [" +
                            (System.currentTimeMillis() - startTimeMillis) + "] ms.");
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("Thread [" + name + "] interrupted.");
        };
        final Runnable consumerRunnable = () -> {
            final String name = consumer + consumerCounter.getAndIncrement();
            while (!Thread.interrupted()) {
                try {
                    System.out.println("Thread [" + name + "] taking...");
                    final long startTimeMillis = System.currentTimeMillis();
                    System.out.println("Thread [" + name + "]: took value of " +
                            MESSAGES_BLOCKING_QUEUE.take());
                    System.out.println("Thread [" + name + "] managed to take for [" +
                            (System.currentTimeMillis() - startTimeMillis) + "] ms.");
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("Thread [" + name + "] interrupted.");
        };

        final List<Thread> threadList = Stream.concat(
                populateThreadsBiFunction.apply(producerRunnable, 10).stream(),
                populateThreadsBiFunction.apply(consumerRunnable, 2).stream())
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
    }

    @Deprecated
    private static List<Thread> populateThreads(final Runnable runnable, final int count) {
        return IntStream.range(0, count).boxed()
                .map(i -> new Thread(runnable))
                .collect(Collectors.toList());
    }

    private static BiFunction<Runnable, Integer, List<Thread>> populateThreadsBiFunction = (runnable, count) ->
            IntStream.range(0, count).boxed()
                    .map(i -> new Thread(runnable))
                    .collect(Collectors.toList());
}
