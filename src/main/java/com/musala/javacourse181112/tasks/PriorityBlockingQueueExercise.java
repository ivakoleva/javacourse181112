package com.musala.javacourse181112.tasks;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityBlockingQueueExercise {
    BlockingQueue<Integer> integerPriorityBlockingQueue= new PriorityBlockingQueue<Integer>();
    AtomicInteger counterOfProducers = new AtomicInteger(0);
    AtomicInteger counterOfConsumers = new AtomicInteger(0);
    Runnable producerRunnable = new Runnable() {
        @Override
        public void run() {

        }
    };
}
