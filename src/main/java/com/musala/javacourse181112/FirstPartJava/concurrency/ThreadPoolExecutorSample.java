package com.musala.javacourse181112.FirstPartJava.concurrency;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva on 21.01.2019
 */
public class ThreadPoolExecutorSample {
    public static void main(final String[] args) throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(5, new ThreadFactory() {
                    private final AtomicInteger atomicInteger = new AtomicInteger();

                    @Override
                    public Thread newThread(final Runnable runnable) {
                        final Thread thread = new Thread(runnable);
                        thread.setName("CustomThread-" + atomicInteger.getAndIncrement());
                        return thread;
                    }
                }
        );
        final Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " started: " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " completed: " + System.currentTimeMillis());
        };

        //executeRunnable(executorService, runnable, 10);
        executeRunnableJoin(executorService, runnable, 10);
    }

    private static void executeRunnableJoin(final ExecutorService executorService, final Runnable runnable, final int count) throws InterruptedException {
        assert executorService != null;
        assert runnable != null;
        final List<Future<?>> futureList = IntStream.range(0, count).boxed()
                .map(i -> executorService.submit(runnable))
                .collect(Collectors.toList());

        while(futureList.stream().anyMatch(future -> !future.isDone())) {
            System.out.println("Some threads are not completed...");
            Thread.sleep(1000);
        }
        System.out.println("All threads done.");
    }

    private static void executeRunnable(final ExecutorService executorService, final Runnable runnable, final int count) {
        assert executorService != null;
        assert runnable != null;
        IntStream.range(0, count).forEach(i -> executorService.execute(runnable));
    }
}
