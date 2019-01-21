package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadPoolExecutorExercise {
    public static void main(String[] args) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);

        final ExecutorService executorService = Executors
                .newFixedThreadPool(3);

        final Callable<Integer> callable = () -> atomicInteger.getAndIncrement();

        final List<Future<Integer>> futureList =
                IntStream.range(0,10)
                .boxed()
                .map(i -> callable)
                .map(executorService::submit)
                .collect(Collectors.toList());

        executorService.shutdown();

        futureList.forEach(future ->{
        try{
            System.out.println(future.get());
        }catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        });
    }
}

