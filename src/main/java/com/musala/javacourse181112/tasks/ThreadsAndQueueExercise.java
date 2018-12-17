package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadsAndQueueExercise implements Serializable {
    private final static long serialVersionUID=123456;
    private final static Supplier<List<Integer>> LIST_SUPPLIER =()-> IntStream.range(0, 20)
                    .boxed()
                    .collect(Collectors.toList());
    private final static File firstFile = new File("C:\\Users\\Public\\Documents");
    private final static File secondFile = new File(firstFile, "serialize.txt");
    public static void main(String[] args) {
        final BlockingQueue <List<Integer>> blockingQueue= new ArrayBlockingQueue<>(10);
        for(int i = 0;i<10;i++){
            blockingQueue.offer((List<Integer>) LIST_SUPPLIER);
        }
        spawnThreads(blockingQueue);
    }
    private static void spawnThreads(final BlockingQueue <List<Integer>> blockingQueue) {
        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(secondFile))){
                    objectOutputStream.writeObject(blockingQueue);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try ( final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(secondFile))){

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