package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PriorityBlockingQueueExercise {
    private static final PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
    private static final int MIN_QUEUE = 1;
    private static final int MAX_QUEUE = 100000;

    private static final String PRODUCER = "Producer";
    private static final String CONSUMER = "Consumer";
    private static final String THREAD_MSG = "Thread";
    private static final String INTERRUPTED_MSG = "interrupted";

    private static final int SLEEP_MILLIS = 2000; // 2 seconds

    public static void main(final String[] args) {
        final AtomicInteger producerCount = new AtomicInteger();
        final AtomicInteger consumerCount = new AtomicInteger();

        final Thread producerThread = new Thread(() ->{

            try {
                final String threadName = PRODUCER + " " + producerCount.getAndIncrement();
                while (!Thread.interrupted()) {
                    final int value = ThreadLocalRandom.current().nextInt(MIN_QUEUE, MAX_QUEUE);
                    System.out.println(THREAD_MSG + " [" + threadName + " | " + value + "]");
                    priorityBlockingQueue.offer(value);
                    Thread.sleep(SLEEP_MILLIS);
                }
            }catch (InterruptedException ignored) {
                System.out.println(PRODUCER + producerCount.get()+ INTERRUPTED_MSG);
            }
        });

        final Thread consumerThread = new Thread(() ->{

            try {
                final String threadName = CONSUMER + " " + consumerCount.getAndIncrement();
                while (!Thread.interrupted()) {
                    if (priorityBlockingQueue.isEmpty()){
                        continue;
                    }
                    System.out.println(THREAD_MSG + " [" + threadName + " | " + priorityBlockingQueue.poll(1, TimeUnit.SECONDS) + "]");

                    Thread.sleep(SLEEP_MILLIS);
                }

            }catch (InterruptedException ignored) {
                System.out.println(CONSUMER + consumerCount.get()+ INTERRUPTED_MSG);
            }
        });

        final List<Thread> threadList = Stream.concat(
                populateThreadsBiFunction.apply(producerThread, 10).stream(),
                populateThreadsBiFunction.apply(consumerThread, 2).stream())
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
    private static BiFunction<Runnable, Integer, List<Thread>> populateThreadsBiFunction = (runnable, count) ->
            IntStream.range(0, count).boxed()
                    .map(i -> new Thread(runnable))
                    .collect(Collectors.toList());
}
