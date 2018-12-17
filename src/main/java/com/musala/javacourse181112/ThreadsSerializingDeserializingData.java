package com.musala.javacourse181112;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadsSerializingDeserializingData implements java.io.Serializable {

    public static void main(final String[] args) throws IOException {
        private final static List<Integer> integerList = IntStream.range(0, 21)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        private final static BlockingQueue<List<Integer>> integerArrayBlockingQueue =
                new ArrayBlockingQueue<>(200, true, Collections.nCopies(10, integerList));

        Files.createDirectory(Paths.get("/tmp/Serialized"));
        File file = new File("/tmp/Serialized");
        Path path = file.toPath();
        File file1 = new File(file, "serialized_objects.txt");
        List<Integer> oneIntegerList = integerArrayBlockingQueue.poll().stream().collect(Collectors.toList());


        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    FileOutputStream fileOut =
                            new FileOutputStream("/tmp/Serialized");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(oneIntegerList);
                    out.close();
                    fileOut.close();
                } catch (IOException i) {
                    i.printStackTrace();
                }

            }
        });


        final Thread producerThread = new Thread(() -> {

            while (!Thread.interrupted()) {

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
    }

}
