package com.musala.javacourse181112.tasks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ThreadsExercise {
    private static Map<Long, String> longStringMap = Collections.synchronizedMap(new HashMap<>());
    private static final int MAX_READS_ENTRIES = 10;

    public static void main(final String[] args) {
        longStringMap = Collections.checkedMap(new HashMap<>(), Long.class, String.class);

        final Thread producerThread = new Thread(() -> {
            //producer thread populating unlimited values on each 3 seconds
            while (!Thread.interrupted()) {
                try {
                   longStringMap.put(System.currentTimeMillis(), "message");
                   Thread.sleep(1000 * 3);
                } catch (InterruptedException ignored) {
                    System.out.println("Producer thread interrupted Exception");
                }
            }
        });

        final Thread consumerThread = new Thread(() -> {
            /*consumer thread
             *** reads 10 map entries
             *** prints them on stdout
             *** interrupts producer thread*/
            int counter = 0;
            while (!Thread.interrupted() && counter++ < MAX_READS_ENTRIES ) {

                for (Map.Entry<Long,String> entry : longStringMap.entrySet()){
                    System.out.println("Key: " + entry.getKey() + " : " + entry.getValue());
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
