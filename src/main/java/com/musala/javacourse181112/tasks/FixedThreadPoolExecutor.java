package com.musala.javacourse181112.tasks;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FixedThreadPoolExecutor {
    public static void main(final String[] args) throws InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            private final AtomicInteger atomicInteger = new AtomicInteger();

            @Override
            public Thread newThread(final Runnable runnable) {
                final Thread thread = new Thread(runnable);
                thread.setName("CustomThread-" + atomicInteger.getAndIncrement());
                return thread;
            }
        });
        final Callable<Integer> callable = () -> {
            System.out.println(Thread.currentThread().getName() + " started: " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " completed: " + System.currentTimeMillis());
            return Thread.currentThread().getPriority();
        };
        executeCallableJoin(executorService, callable, 10);
        executorService.shutdown();

    }

    private static void executeCallableJoin(final ExecutorService executorService, final Callable<Integer> callable, final int count) throws InterruptedException {
        assert executorService != null;
        assert callable != null;
        final List<Future<Integer>> futureList = IntStream.range(0, count).boxed()
                .map(i -> executorService.submit(callable))
                .collect(Collectors.toList());

        while(futureList.stream().anyMatch(future -> !future.isDone())) {
            System.out.println("Some threads are not completed...");
            Thread.sleep(1000);
        }
        System.out.println("All threads done.");
        futureList.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
