package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// TODO: investigate adding alert messages on each step; trace blocking
public class ThreadsAndQueue {
    private static Supplier<List<Integer>> integerListSupplier = () ->
            IntStream.range(0, 21).boxed().collect(Collectors.toList());

    public static void main(final String[] args) {
        final AtomicInteger cycleCount = new AtomicInteger();

        final File file = new File("testHomework");
        final BlockingQueue<List<Integer>> blockingQueue = new LinkedBlockingQueue<>();
        /*final List<Integer> integerList = IntStream.range(0,21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        //add 10 same lists in the queue
        for (int i = 0; i < 10; i++) {
            blockingQueue.add(integerList);
        }*/

        // populate the queue with 10 different lists
        populateBlockingQueue(blockingQueue);

        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                    //Serialize first list from the queue in file
                    objectOutputStream.writeObject(blockingQueue.take());
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    //Check if file exists
                    if (file.exists()) {

                        //Read and deserialize the first list from file and print to stdout
                        try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                            final List<Integer> integerList = (List<Integer>) objectInputStream.readObject();
                            System.out.println(integerList);

                            //add the list at the end of the queue
                            blockingQueue.put(integerList);

                            //delete file
                            file.delete();

                            //Cycle count number
                            System.out.println("Cycle count " + cycleCount.getAndIncrement());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException | ClassNotFoundException ignored) {
                    //e.printStackTrace();
                }
            }
        });

        consumerThread.start();
        producerThread.start();
        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void populateBlockingQueue(final BlockingQueue<List<Integer>> blockingQueue) {
        /*final List<Integer> integerList = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList.add(21);
        blockingQueue.add(integerList);*/

        IntStream.range(0, 10).forEach(i -> blockingQueue.add(integerListSupplier.get()));
    }
}
