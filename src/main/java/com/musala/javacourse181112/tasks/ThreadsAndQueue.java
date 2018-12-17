package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadsAndQueue {
    public static void main(final String[] args) {
        final File file = new File("testHomework");
        final Queue<List> listQueue = new LinkedList<>();
        /*final List<Integer> integerList = IntStream.range(0,21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        //add 10 same lists in the queue
        for (int i = 0; i < 10; i++) {
            listQueue.add(integerList);
        }*/

        // populate the queue with 10 different lists
        populateListQueue(listQueue);

        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    //Serialize first list from the queue in file
                    final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(((LinkedList<List>) listQueue).peekFirst());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        final AtomicInteger cycleCount = new AtomicInteger();
        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    //Check if file exists
                    if (file.exists()) {
                        //Read and deserialize the first list from file and print to stdout
                        Queue queue = null;
                        final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        queue = ((Queue) objectInputStream.readObject());
                        System.out.println(queue);

                        //delete file
                        file.deleteOnExit();

                        //add the list at the end of the queue
                        ((LinkedList<List>) listQueue).offerLast((List) queue);

                        //remove first list from the queue
                        ((LinkedList<List>) listQueue).removeFirst();

                        //Cycle count number
                        System.out.println("Cycle count " + cycleCount.getAndIncrement());
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

    private static void populateListQueue(final Queue<List> listQueue) {
        final List<Integer> integerList = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList.add(21);
        listQueue.add(integerList);

        final List<Integer> integerList2 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList2.add(22);
        listQueue.add(integerList2);

        final List<Integer> integerList3 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList3.add(23);
        listQueue.add(integerList3);

        final List<Integer> integerList4 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList4.add(24);
        listQueue.add(integerList4);

        final List<Integer> integerList5 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList5.add(25);
        listQueue.add(integerList5);

        final List<Integer> integerList6 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList6.add(26);
        listQueue.add(integerList6);

        final List<Integer> integerList7 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList7.add(27);
        listQueue.add(integerList7);

        final List<Integer> integerList8 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList8.add(28);
        listQueue.add(integerList8);

        final List<Integer> integerList9 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList9.add(29);
        listQueue.add(integerList9);

        final List<Integer> integerList10 = IntStream.range(0, 21).boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        integerList10.add(30);
        listQueue.add(integerList10);
    }
}
