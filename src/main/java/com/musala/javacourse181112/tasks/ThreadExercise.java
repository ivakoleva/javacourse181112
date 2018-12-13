package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
    public static void main(final String[] args) {
        final WrappedMap wrappedMap = new WrappedMap(new ConcurrentHashMap<>());

        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                final long time = System.currentTimeMillis();
                wrappedMap.getMap().put(time, "Current time:" + time);
                //System.out.println(2);
            }
            System.out.println("Producer thread exited.");
        });
        final Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; ) {
                final Map.Entry<Long, String> element = wrappedMap.poll();
                if (element != null) {
                    System.out.println(element.getKey() + "->" + element.getValue());
                    i++;
                }
                //System.out.println(1);
            }
            System.out.println("Consumer thread exited.");
            producerThread.interrupt();
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
    private final Map<Long, String> map;

    public Map<Long, String> getMap() {
        return map;
    }

    public WrappedMap(final Map<Long, String> map) {
        this.map = map;
    }

    public synchronized Map.Entry<Long, String> poll() {
        final Iterator<Map.Entry<Long, String>> iterator = map.entrySet().iterator();
        if (iterator.hasNext()) {
            final Map.Entry<Long, String> entry = iterator.next();
            iterator.remove();
            return entry;
        }
        return null;
    }
}