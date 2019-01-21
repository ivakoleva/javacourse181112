package com.musala.javacourse181112.homeworks;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadsSerializingToQueueHomework {
    public static void main(String[] args) {
        File file = new File("storage");

        List<Integer> integerList = IntStream.range(0, 21).boxed().collect(Collectors.toList());
        Queue<List> listQueue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            listQueue.add(integerList);
        }

        Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(((LinkedList<List>) listQueue).peekFirst());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        AtomicInteger count = new AtomicInteger();
        Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    if (file.exists()) {
                        Queue queue = null;
                        final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        queue = ((Queue) objectInputStream.readObject());
                        System.out.println(queue);

                        file.deleteOnExit();

                        ((LinkedList<List>) listQueue).offerLast((List) queue);
                        ((LinkedList<List>) listQueue).removeFirst();
                        System.out.println("Count: " + count.getAndIncrement());
                    }
                } catch (IOException | ClassNotFoundException ignored) {

                }
            }

        });
        consumerThread.start();
        producerThread.start();
        try{
            consumerThread.join();
            producerThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.exit(0);
    }
}
