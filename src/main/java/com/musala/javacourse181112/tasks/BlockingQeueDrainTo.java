package com.musala.javacourse181112.tasks;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQeueDrainTo {
    public static void main(String[] args) throws Exception {
        final BlockingQueue<Integer> queue = new ArrayBlockingQueue(10);
        final Queue collection = new PriorityQueue<Integer>(5);
        for( int i=0;i<10; i++){
           queue.offer(i);
        }
        queue.drainTo(collection,5);


    }




    }



