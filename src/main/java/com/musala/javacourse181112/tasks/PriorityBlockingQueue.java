package com.musala.javacourse181112.tasks;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class PriorityBlockingQueue {
    private final static BlockingQueue<Integer> INTEGER_BLOCKING_QUEUE = new java.util.concurrent.PriorityBlockingQueue<>(10);
    private final static int INTEGER_LIST_MIN = 1;
    private final static int INTEGER_LIST_MAX = 100000;

    public static void main(String[] args) {
        populateAndConsume();
    }

    static class ProducerThread extends Thread {
        int value = 0;
        @Override
        public void run() {
            while(true){
                try{
                    value = ThreadLocalRandom.current().nextInt(INTEGER_LIST_MIN, INTEGER_LIST_MAX + 1);
                    INTEGER_BLOCKING_QUEUE.offer(value);
                    System.out.println(INTEGER_BLOCKING_QUEUE);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ConsumerThread extends Thread {
        @Override
        public void run() {
            while(true){
                try{
                   INTEGER_BLOCKING_QUEUE.removeIf(element -> element % 2 == 0);
                    System.out.println(INTEGER_BLOCKING_QUEUE);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void populateAndConsume(){
        ProducerThread producerThread1 = new ProducerThread();
        ProducerThread producerThread2 = new ProducerThread();
        ConsumerThread consumerThread1 = new ConsumerThread();
        ConsumerThread consumerThread2 = new ConsumerThread();
        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();

        try{
            producerThread1.join();
            producerThread2.join();
            consumerThread1.join();
            consumerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
