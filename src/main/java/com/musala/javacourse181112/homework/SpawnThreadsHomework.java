package com.musala.javacourse181112.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public class SpawnThreadsHomework {
    public static Map<Long, String> LONG_STRING_MAP = Collections.synchronizedMap(new HashMap<>());
    public static final int MAP_LENGTH = 10;

    public static void main(String[] args) {
        LONG_STRING_MAP = Collections.checkedMap(new HashMap<>(), Long.class, String.class);

        final BiConsumer<Long, String> populateMap = (key, value) ->
                LONG_STRING_MAP.put(key, value);

        final Thread producerThread = new Thread(() -> {

            while (!Thread.interrupted()) {
                final long millis = System.currentTimeMillis();
                if (LONG_STRING_MAP.isEmpty()) {
                    continue;
                }
                populateMap.accept(System.currentTimeMillis(), "Random String: " + Objects.toString(millis, null));

                try {
                    Thread.sleep(1000 * 3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread consumerThread = new Thread(() -> {
            int i = 0;

            while (!Thread.interrupted() && i++ < MAP_LENGTH) {
                if (LONG_STRING_MAP.isEmpty()) {
                    continue;
                }
                for (Map.Entry<Long, String> pair : LONG_STRING_MAP.entrySet()) {
                    System.out.println("Key: " + pair.getKey() + "Value: " + pair.getValue());
                }
                i++;
                System.out.println(LONG_STRING_MAP.size());

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
        // 2nd Commit
    }
}
