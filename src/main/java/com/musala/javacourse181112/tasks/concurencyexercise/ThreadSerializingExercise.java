package com.musala.javacourse181112.tasks.concurencyexercise;

import java.io.*;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadSerializingExercise {
    public static void main(final String[] args) throws IOException {
        Queue<List<Integer>> listQueue = new ConcurrentLinkedQueue<>();

        for (int i = 0; i < 10; i++) {
            listQueue.offer(IntStream.range(0, 20).boxed().collect(Collectors.toList()));
        }
        File serilizationDir = new File("src\\main\\java\\com\\musala\\javacourse181112" +
                "\\tasks\\concurencyexercise\\Serlized");
        serilizationDir.mkdir();
        File listFile = new File("src\\main\\java\\com\\musala\\javacourse181112" +
                "\\tasks\\concurencyexercise\\Serlized\\List.txt");

        Thread consumerThread = new Thread(() -> {
            ObjectOutputStream objectOutputStream = null;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    listFile.createNewFile();
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(listFile));
                    while (!listQueue.isEmpty()) {
                        System.out.println("Serilizing:");
                        objectOutputStream.writeObject(listQueue.poll());
                    }
                } catch (IOException ignored) {
                }

            }
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        Thread producerThread = new Thread(() -> {
            ObjectInputStream objectInputStream = null;
            while (!Thread.currentThread().isInterrupted()) {
                try {

                    objectInputStream = new ObjectInputStream(new FileInputStream(listFile));
                    Object object = objectInputStream.readObject();
                    if(object instanceof List) {
                        System.out.println(object);
                        listQueue.offer((List<Integer>) object);


                    }
                } catch (IOException | ClassNotFoundException ignored) {

                }
            }
            System.out.println(listQueue);
            try {

                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            listFile.delete();
        });

        consumerThread.start();
        producerThread.start();

        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
