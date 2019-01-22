package com.musala.javacourse181112.tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedThreadPoolExecutorExercise {
    /*
     *** instantiate a fixed thread pool executor of size 3
     *** submit 10 Callable instances, returning an object instance
     *** collect the result of all submitted callables
     *** shut down the executor service
     *** exit the program
     * */
    public static void main(final String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(3);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final Callable<Integer> callable = atomicInteger::getAndIncrement;
        /*final List<Future<Integer>> futureList = IntStream.range(0, 10)
                .map()
                .collect(Collectors.toList());*/

        executorService.shutdown();
    }
}
