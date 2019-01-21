package com.musala.javacourse181112.tasks.concurencyexercise;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FixedThreadPoolExecutorExercise {
    public static void main(final String[] args) {
        AtomicInteger atomicI =new AtomicInteger();

        final ExecutorService executorService = Executors.newFixedThreadPool(3);

        final Callable<Integer> callable= atomicI::getAndIncrement;

        final List<Future<Integer>> futureList=IntStream.range(0,10)
                .boxed()
                .map(i->executorService.submit(callable))
                .collect(Collectors.toList());

        futureList.forEach(future-> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }
}
