package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FixedThreadPoolExecutor {
    public static void main(final String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(3);

        final AtomicInteger atomicInteger = new AtomicInteger();
        final Callable<Integer> callable = atomicInteger::getAndIncrement;

        final List<Future<Integer>> futureList = IntStream.range(0, 10)
                .boxed()
                .map(i -> callable)
                .map(executorService::submit)
                .collect(Collectors.toList());

        executorService.shutdown();


    }
}
