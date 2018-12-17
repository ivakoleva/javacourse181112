package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadsAndQueueExercise implements Serializable {
    private final static long serialVersionUID=123456;
    private final static BlockingQueue<List<Integer>> QUEUE_OF_LIST = new ArrayBlockingQueue<>(200,
            true,
            Collections.nCopies(10, IntStream.range(0, 20)
                    .boxed()
                    .collect(Collectors.toList())));
    private final static File firstFile = new File("C:\\Users\\Public\\Documents");
    private final static File secondFile = new File(firstFile, "serialize.txt");
    private final static List<Integer> LIST_OF_INTEGER = new ArrayList<>(Objects.requireNonNull(QUEUE_OF_LIST.poll()));
    public static void main(String[] args) {
        System.out.print(QUEUE_OF_LIST);
        spawnThreads();
    }
    private static void spawnThreads() {
        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(secondFile));
                    objectOutputStream.writeObject(LIST_OF_INTEGER);
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(secondFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}