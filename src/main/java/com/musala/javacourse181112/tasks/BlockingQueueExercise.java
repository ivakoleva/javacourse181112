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
       System.out.println("Before drain:");
       blockingQueue.forEach(i -> System.out.print(i + " "));
       blockingQueue.drainTo(queue,5);
       System.out.println("After drain:");
       queue.forEach(i -> System.out.print(i + " "));
       blockingQueue.forEach(i -> System.out.print(i + " "));
    }
}
