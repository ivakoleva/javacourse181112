package com.musala.javacourse181112.tasks;

import java.io.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
The task isn't finished. It compiles so far, but doesn't execute how it is supposed to
Missing code: the the bonus part - use AtomicInteger
 */

// OOK
public class ElaborateSerializer implements Serializable {
    private final static long serialVersionUID = 8451123469653627934L;

    private final static List<Integer> INTEGER_LIST = IntStream.range(0, 21).boxed().collect(Collectors.toList());
    private final static BlockingQueue<List<Integer>> INTEGER_QUEUE = new ArrayBlockingQueue<>(
            200,
            true,
            Collections.nCopies(10, INTEGER_LIST)); // TODO: rather function than reusing same collection reference

    private final static String PATH_NAME = "D:\\course\\test"; // TODO: change relative path so it works on every platform
    //private final static Path FILE_PATH = Paths.get(PATH_NAME);
    //private final static File FILE = FILE_PATH.toFile();
    private final static File FILEPATH_SERIALIZED_OBJECTS = new File(PATH_NAME);
    private final static Path FILE_PATH = FILEPATH_SERIALIZED_OBJECTS.toPath();
    private final static File FILE_SERIALIZED_OBJECTS = new File(FILEPATH_SERIALIZED_OBJECTS, "serialized_objects.txt");

    private static final Supplier<List<Integer>> POLL_INTEGER_LIST_FROM_QUEUE = INTEGER_QUEUE::poll;

    public static void main(final String[] args) throws IOException {
        System.out.println(INTEGER_QUEUE);
        spawnThreads();
    }

    private static void spawnThreads() {
        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try (final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_SERIALIZED_OBJECTS))) {
                    objectOutputStream.writeObject(POLL_INTEGER_LIST_FROM_QUEUE.get());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread producerThread = new Thread(() -> {
            try {
                final WatchService service = FileSystems.getDefault().newWatchService();
                while (!Thread.interrupted()) {
                    //WatchKey key =  FILE_PATH.register(service, StandardWatchEventKinds.ENTRY_CREATE);
                    final WatchKey key = service.take();
                    for (WatchEvent<?> event : key.pollEvents()) {
                        final WatchEvent.Kind<?> kind = event.kind();

                        if (StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
                            //System.out.println("Creating " + event.context().toString());
                            System.out.println("Watched [eventType=" + kind + ", FILE_PATH=" + event.context() + "]");

                            List<Integer> oneIntegerList = null;
                            try (final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_SERIALIZED_OBJECTS))) {
                                oneIntegerList = (List<Integer>) objectInputStream.readObject();
                            }

                            INTEGER_QUEUE.offer(oneIntegerList);

                            Files.delete(FILE_PATH);
                        }
                        if (!key.reset()) {
                            break;
                        }
                    }
                }
            } catch (IOException | InterruptedException | ClassNotFoundException e) {
                e.printStackTrace();
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
