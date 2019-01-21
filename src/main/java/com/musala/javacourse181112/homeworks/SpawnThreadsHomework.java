package com.musala.javacourse181112.homeworks;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;

public class SpawnThreadsHomework {
    public final static Map<Long, String> LONG_STRING_MAP = Collections.checkedMap(
            new ConcurrentHashMap<>(), Long.class, String.class); //Collections.synchronizedMap(new HashMap<>());
    public static final int MAX_PRODUCED_ENTRIES_COUNT = 10;

    private static final Object monitor = new Object();

    public static void main(String[] args) {
        // demo BiConsumer show-case purpose
        final BiConsumer<Long, String> populateMap = LONG_STRING_MAP::put;

        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                final long millis = System.currentTimeMillis();
                populateMap.accept(System.currentTimeMillis(), "Random String: " + millis);

                try {
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        final Thread consumerThread = new Thread(() -> {
            int i = 0;

            while (!Thread.interrupted() && i < MAX_PRODUCED_ENTRIES_COUNT) {
                synchronized (monitor) {
                    final Iterator<Map.Entry<Long, String>> iterator = LONG_STRING_MAP.entrySet().iterator();
                    if (!iterator.hasNext()) {
                        continue;
                    }

                    final Map.Entry<Long, String> entry = iterator.next();
                    System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
                    iterator.remove();
                    i++;

                    System.out.println(LONG_STRING_MAP.size());
                }
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
