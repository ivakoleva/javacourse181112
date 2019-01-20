package com.musala.javacourse181112.tasks;


import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class ThreadExercise {

    private static final int VALUES_READ = 10;


    private static Function<Map<Long, String>, Map.Entry<Long, String>> entryFunction = (map) -> {
        Iterator<Map.Entry<Long, String>> mapIterator = map.entrySet().iterator();
        Map.Entry<Long, String> entry;
        if (mapIterator.hasNext()) {
            entry = mapIterator.next();
            mapIterator.remove();
            return entry;
        }
        return null;

    };

    public static void main(final String[] args) {
        final ConcurrentHashMap<Long, String> concurrentHashMap = new ConcurrentHashMap<>();

        Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                Long time = System.currentTimeMillis();
                concurrentHashMap.put(time, "Current time- " + time);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(() -> {
            Map.Entry<Long, String> entry;


            for (int i = 0; i < VALUES_READ; ) {
                entry = entryFunction.apply(concurrentHashMap);
                if (entry != null) {
                    System.out.println(i + " Key: " + entry.getKey() + " Value :" + entry.getValue());
                    i++;
                }
            }
            if (!producerThread.isInterrupted()) {
                producerThread.interrupt();
            }

            System.exit(0);
        });

        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
