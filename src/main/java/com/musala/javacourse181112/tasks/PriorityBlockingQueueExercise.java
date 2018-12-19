package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PriorityBlockingQueueExercise {
    private static final PriorityBlockingQueue<Integer> PRIORITY_BLOCKING_QUEUE = new PriorityBlockingQueue<>();
    private static final int MIN_QUEUE = 1;
    private static final int MAX_QUEUE = 100000;

    private static final String PRODUCER = "Producer";
    private static final String CONSUMER = "Consumer";
    private static final String THREAD_MSG = "Thread";
    private static final String INTERRUPTED_MSG = "interrupted";

    private static final int SLEEP_MILLIS = 2000; // 2 seconds

    public static void main(final String[] args) {
        final List<Thread> threadList = Stream.concat(
                populateThreads(() -> {
                    try {
                        while (!Thread.interrupted()) {
                            final int value = ThreadLocalRandom.current().nextInt(MIN_QUEUE, MAX_QUEUE);
                            System.out.println(THREAD_MSG + " [" + Thread.currentThread().getName() + " | " + value + "]");
                            PRIORITY_BLOCKING_QUEUE.offer(value);
                            Thread.sleep(SLEEP_MILLIS);
                        }
                    } catch (InterruptedException ignored) {
                        System.out.println(Thread.currentThread().getName() + " " + INTERRUPTED_MSG);
                    }
                }, PRODUCER, 10).stream(),
                populateThreads(() -> {
                    try {
                        while (!Thread.interrupted()) {
                            if (PRIORITY_BLOCKING_QUEUE.isEmpty()) {
                                continue;
                            }
                            System.out.println(THREAD_MSG + " [" + Thread.currentThread().getName() + " | " + PRIORITY_BLOCKING_QUEUE.poll(1, TimeUnit.SECONDS) + "]");

                            Thread.sleep(SLEEP_MILLIS);
                        }

                    } catch (InterruptedException ignored) {
                        System.out.println(Thread.currentThread().getName() + " " + INTERRUPTED_MSG);
                    }
                }, CONSUMER, 2).stream())
                .collect(Collectors.toList());

        threadList.forEach(Thread::start);
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static List<Thread> populateThreads(final Runnable runnable, final String namePrefix, final int count) {
        return IntStream.range(0, count).boxed()
                .map(i -> new Thread(runnable, namePrefix + " " + i))
                .collect(Collectors.toList());
    }
}
