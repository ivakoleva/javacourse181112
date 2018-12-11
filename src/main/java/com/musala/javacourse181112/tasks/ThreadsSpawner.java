package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// ok
public class ThreadsSpawner {
    private final static int LIMIT = 10;
    private static Map<Long, String> LONG_STRING_MAP = Collections.synchronizedSortedMap(new TreeMap<>());

    public static void main(final String[] args) {
        LONG_STRING_MAP = Collections.checkedMap(new TreeMap<>(), Long.class, String.class);

        /*final BiConsumer<Long, String> printToStdout = (key, message) ->
            System.out.println(Thread.currentThread().getName() + " (" + key + "): " + message);*/
        final Thread producerThread = new Thread(() -> {
            final String value = "producer";
            while (!Thread.interrupted()) {
                try {
                    LONG_STRING_MAP.put(System.currentTimeMillis(), value);
                    Thread.sleep(3000);
                } catch (InterruptedException ignored) {
                    //e.printStackTrace();
                    System.out.println("producerThread interrupted.");
                }
            }
        });

        final Thread consumerThread = new Thread(() -> {
            //final String value = "consumer";
            int i = 0;
            while (!Thread.interrupted() && i < LIMIT) {
                if (LONG_STRING_MAP.isEmpty()) {
                    continue;
                }
                for (Map.Entry<Long, String> entry : LONG_STRING_MAP.entrySet()) {
                    System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
                }
                i++;
                System.out.println("Print LONG_STRING_MAP.size()" + LONG_STRING_MAP.size());
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


