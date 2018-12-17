package com.musala.javacourse181112.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ThreadsExercise {
    public static void main(String[] args) {
        Map<Integer,Integer> integerIntegerMap=new HashMap<>();

        final Thread producerThread = new Thread(() -> {
        });

        final Thread consumerThread = new Thread(() -> {
            Iterator integerIntegerMapIterator = integerIntegerMap.entrySet().iterator();
            for(int i=0;integerIntegerMapIterator.hasNext()&&i<10;i++) {
                Map.Entry entry = (Map.Entry) integerIntegerMapIterator.next();
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            producerThread.interrupt();
        });
        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}

