package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
The task isn't finished. It compiles so far, but doesn't execute how it is supposed to, I suppose my use of WatchEvent
    isn't entirely correct, but I haven't used the debugger to figure out how to fix it. Please give review and recommendations.
Missing code: producer doesn't put to queue and the the bonus part
 */

public class ElaborateSerializer implements Serializable {
    private final static long serialVersionUID = 8451123469653627934L;
    private final static List<Integer> INTEGER_LIST = IntStream.range(0, 21)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));

    private final static BlockingQueue<List<Integer>> INTEGER_QUEUE = new ArrayBlockingQueue<List<Integer>>(200,
            true,
            Collections.nCopies(10, INTEGER_LIST));

    private final static String PATH_NAME = "D:\\course\\test";
    //private final static Path path = Paths.get(PATH_NAME);
    //private final static File file = path.toFile();
    private final static File file = new File(PATH_NAME);
    private final static Path path = file.toPath();
    private final static File file1 = new File(file, "serialized_objects.txt");
    private final static List<Integer> ONE_INTEGER_LIST = INTEGER_QUEUE.poll().stream().collect(Collectors.toList());

    public static void main(String[] args) throws IOException {

        System.out.println(INTEGER_QUEUE);
        spawnThreads();
    }

    private static void spawnThreads() throws IOException {

        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file1));
                    objectOutputStream.writeObject(ONE_INTEGER_LIST);
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        final Thread producerThread = new Thread(() -> {
            List<Integer> oneIntegerList = null;
            while (!Thread.interrupted()) {
                try {
                    WatchService service = FileSystems.getDefault().newWatchService();
                    while (true) {
                        //WatchKey key =  path.register(service, StandardWatchEventKinds.ENTRY_CREATE);
                        WatchKey key = service.take();
                        for (WatchEvent<?> event : key.pollEvents()) {
                            WatchEvent.Kind<?> kind = event.kind();
                            if (kind == StandardWatchEventKinds.OVERFLOW) {
                                continue;
                            }
                            //WatchEvent<Path> watchEvent = (WatchEvent<Path>) event;
                            //Path path = watchEvent.context();
                            System.out.println("[eventType=" + kind
                                    + ", path=" + path.getFileName() + "]");
                            final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file1));
                            oneIntegerList = (List<Integer>) objectInputStream.readObject();
                            objectInputStream.close();
                            Files.delete(path);
                            if (!key.reset()) {
                                break;
                            }
                        }
                    }
                } catch (IOException | InterruptedException | ClassNotFoundException e) {
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
