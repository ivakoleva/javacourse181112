package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/*
 ** spawning two threads, sharing a map instance
 *** Long key - current system millis
 *** String message
 *** when adding entries, do runtime type check of elements explicitly
 ** producer thread populating unlimited values on each 3 seconds
 ** consumer thread
 *** reads 10 map entries
 *** prints them on stdout
 *** interrupts producer thread
 ** main thread exits with 0
 */
public class ThreadExercise {
    public static void main(String[] args) {
        WrappedMap myMap = new WrappedMap();
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()) {
                    long time = System.currentTimeMillis();
                    myMap.concurrentMap.put(time, "Current time:" + time);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ignore) {
                    }
                    //System.out.println(2);
                }
                System.out.println("Producer thread exited.");
            }
        });
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ) {
                    Map.Entry<Long, String> element = myMap.poll();
                    if (element != null) {
                        System.out.println(element.getKey() + "->" + element.getValue());
                        i++;
                    }
                    //System.out.println(1);
                }
                while(producerThread.getState()!= Thread.State.TIMED_WAITING&&!producerThread.isInterrupted())
                {
                    producerThread.interrupt();
                }
                System.out.println("Consumer thread exited.");

            }
        });
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException ignore) {
        }
    }

}

@Deprecated
class SingletonMapEntry {

    public Map<Integer, Integer> getInstance() {
        return Collections.singletonMap(1, 1);
    }
}

class WrappedMap {
    public ConcurrentMap<Long, String> concurrentMap = new ConcurrentHashMap<>();

    public WrappedMap() {
    }

    public Map.Entry<Long, String> poll() {
        Iterator<Map.Entry<Long, String>> mapIterator = concurrentMap.entrySet().iterator();
        if (mapIterator.hasNext()) {
            Map.Entry<Long, String> entry = mapIterator.next();
            mapIterator.remove();
            return entry;
        }
        return null;
    }

}