package com.musala.javacourse181112.tasks;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExercise {
    public static void main(String[] args) {
       final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
       final Queue queue = new PriorityQueue<>(5);
       for (int i=0;i<10;i++){
           blockingQueue.offer(i);
       }
       blockingQueue.drainTo(queue,5);
    }
}
