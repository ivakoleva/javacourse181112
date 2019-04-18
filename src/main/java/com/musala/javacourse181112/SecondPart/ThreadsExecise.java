package com.musala.javacourse181112.SecondPart;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class ThreadsExecise {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);
        Object locker = new Object();

        List<Thread> runnables = new LinkedList<>();

        Runnable sumThread = () -> {
            while (true){
            synchronized (locker) {
                counter.incrementAndGet();
                System.out.println(counter);

            }}
        };


        Thread thread = new Thread(sumThread);
        runnables.add(thread);

        Runnable subtractionThread = () -> {
            while (true){
                synchronized (locker) {
                    counter.decrementAndGet();
                    System.out.println(counter);
                }
            }
        };
        Thread thread2 = new Thread(subtractionThread);
        runnables.add(thread2);

        runnables.forEach(Thread::start);

        for (Thread runnable : runnables) {
            runnable.join();
        }

        //runnables.stream(Thread::interrupt);
        sleep(10000);
        thread.interrupt();
        thread2.interrupt();

    }
}
