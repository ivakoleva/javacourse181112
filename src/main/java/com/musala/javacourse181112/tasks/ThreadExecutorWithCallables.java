package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadExecutorWithCallables {
    public static void main(final String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(3);

        AtomicInteger l = new AtomicInteger(0);
        Callable<Integer> callable = () -> l.getAndIncrement();

        final List<Future<Integer>> futureList = IntStream.range(0, 10)
                .boxed()
                .map(i -> callable)
                .map(executorService::submit)
                .collect(Collectors.toList());

        executorService.shutdown();

        futureList.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
