package com.musala.javacourse181112.FirstPartJava.collections;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiConsumer;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class SyncrhonizedWrappersExample {
    private static final List<Integer> INTEGER_LIST = Collections.synchronizedList(new ArrayList<>()); //new ArrayList<>();
    private static final int PRODUCED_STRINGS_MAX_COUNT = 10;
    private static final int INTEGER_LIST_MIN = 10;
    private static final int INTEGER_LIST_MAX = 1000;

    public static void enlistSynchronizedWrappers() {
        final Collection<?> synchronizedCollection = Collections.synchronizedCollection(new ArrayList<>());
        final List<?> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        final Set<?> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
        final Map<?, ?> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        //...
    }

    public static void main(final String[] args) {
        final BiConsumer<String, String> printToStdout = (role, message) ->
                System.out.println(Thread.currentThread().getName() + " (" + role + "): " + message);


        final Thread consumerThread = new Thread(() -> {
            final String role = "consumer";
            while (!Thread.interrupted()) {
                if (INTEGER_LIST.isEmpty()) {
                    continue;
                }
                printToStdout.accept(role, "Print INTEGER_LIST.size()");
                System.out.println(INTEGER_LIST.size());

                printToStdout.accept(role, "Print INTEGER_LIST.forEach() before modification");
                INTEGER_LIST.forEach(System.out::println);

                INTEGER_LIST.removeIf(element -> element % 2 == 0);

                printToStdout.accept(role, "Print INTEGER_LIST.forEach() after modification");
                INTEGER_LIST.forEach(System.out::println);
            }
            printToStdout.accept(role, "interrupted.");
        });

        final Thread producerThread = new Thread(() -> {
            final String role = "producer";
            int i = 0;
            while (!Thread.interrupted() && i++ < PRODUCED_STRINGS_MAX_COUNT) {
                final int value = ThreadLocalRandom.current().nextInt(INTEGER_LIST_MIN, INTEGER_LIST_MAX + 1);
                printToStdout.accept(role, "adding " + value);
                INTEGER_LIST.add(value);

                try {
                    printToStdout.accept(role, "sleeping for " + value + "ms");
                    Thread.sleep(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            printToStdout.accept(role, "interrupting consumer and exiting...");
            //consumerThread.stop(); <- force stop deprecated, in favour of graceful interrupt approach
            //                       <- need to handle interrupt manually
            consumerThread.interrupt();
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

    /*private static class ProducerRunnable implements Runnable {
        @Override
        public void run() {

        }
    }*/
}
