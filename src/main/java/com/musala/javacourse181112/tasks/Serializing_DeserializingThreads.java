package com.musala.javacourse181112.tasks;

import java.io.*;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 ** Threads, serializing/deserializing data and put/take to queue
     *** first, populate a queue with 10 lists of integers 0-20
     *** create a specific directory on FS (file system), dedicated to store serialized data
     *** then spawn two threads
         **** consumer thread, while not interrupted:
             ***** takes a list from queue
             ***** for each list, serializes to one file
         **** producer thread, while not interrupted:
             ***** watches the directory for a new file
             ***** reads file, deserializes file data, removes file
             ***** puts to queue
 */
public class Serializing_DeserializingThreads {
    public static void main(String[] args) {
        doWithQueue();
        //doWithWrappedQueuedMap();
    }

    public static void doWithQueue() {
        Function<Integer, List<Integer>> IntegerListGenerator = nIntegers ->
                IntStream
                        .range(0, nIntegers + 1)
                        .boxed()
                        .collect(Collectors.toList());

        BiFunction<Integer, Integer, Queue<List<Integer>>> IntegerQueueGenerator = (nLists, nIntegers) ->
                IntStream
                        .range(0, nLists + 1)
                        .boxed()
                        .map(i -> IntegerListGenerator.apply(nIntegers))
                        .collect(Collectors.toCollection(ConcurrentLinkedQueue::new));
        ConcurrentLinkedQueue<List<Integer>> integerListQueue = (ConcurrentLinkedQueue<List<Integer>>) IntegerQueueGenerator.apply(10, 0);

        File queueFile = new File("src\\PawIncorporated\\java\\com\\musala" +
                "\\javacourse181112\\tasks" +
                "\\Serializing\\");
        queueFile.mkdirs();
        File file = new File("src\\PawIncorporated\\java\\com\\musala" +
                "\\javacourse181112\\tasks" +
                "\\Serializing", "WithQueue.bin");
        Thread serializingThread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!Thread.interrupted()) {

                    try {
                        file.createNewFile();
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                        if (!integerListQueue.isEmpty()) {
                            System.out.println("Serializing:");
                            integerListQueue.forEach(i-> System.out.print(i+" "));
                            System.out.println();
                            objectOutputStream.writeObject(integerListQueue.poll());
                            //Thread.sleep(1,979);
                        }
                        objectOutputStream.close();
                    } catch (IOException ignore) {
                    }
                }
            }
        });

        Thread deserializingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()) {

                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        Object tempObject=objectInputStream.readObject();
                        if (tempObject instanceof List) {
                            System.out.println("before:");
                            integerListQueue.forEach(i -> System.out.print(i + " "));
                            System.out.println();
                            integerListQueue.offer((List<Integer>) tempObject);
                            System.out.println("after:");
                            integerListQueue.forEach(i -> System.out.print(i + " "));
                            System.out.println();
                        }
                        objectInputStream.close();
                        file.delete();
                    } catch (IOException | ClassNotFoundException ignore) {
                    }
                }
            }
        });
        serializingThread.start();
        deserializingThread.start();
        try {
            serializingThread.join();
            deserializingThread.join();
        } catch (InterruptedException ignore) {
        }
    }

    public static void doWithWrappedQueuedMap() {

    }
}

