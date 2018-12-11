package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ThreadsSpawner {
    private final static int LIMIT = 10;
    private static Map<Long, String> LONG_STRING_MAP = Collections.synchronizedSortedMap(new TreeMap<>());

    public static void main(String[] args) {
        LONG_STRING_MAP = Collections.checkedMap(new TreeMap<>(), Long.class, String.class);

    /*final BiConsumer<Long, String> printToStdout = (key, message) ->
            System.out.println(Thread.currentThread().getName() + " (" + key + "): " + message);*/
        final Thread producerThread = new Thread(() -> {

            while (!Thread.interrupted()) {
                final String value = "producer";
                final long millis = System.currentTimeMillis();


                try {
                    LONG_STRING_MAP.put(millis, value);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });


        final Thread consumerThread = new Thread(() -> {
            final String value = "consumer";
            int i = 0;
            while (!Thread.interrupted() && i < LIMIT) {
                if (LONG_STRING_MAP.isEmpty()) {
                    continue;
                }
                for (Map.Entry<Long, String> pair : LONG_STRING_MAP.entrySet()) {
                    System.out.println("key: " + pair.getKey() + "value: " + pair.getValue());
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


