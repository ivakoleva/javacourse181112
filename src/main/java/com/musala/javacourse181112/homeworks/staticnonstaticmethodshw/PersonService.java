package com.musala.javacourse181112.homeworks.staticnonstaticmethodshw;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class PersonService {
    private final Queue<Person> PERSON_QUEUE = new LinkedBlockingQueue<>();

    public static void printPersonName(final Person person) {
        System.out.println(person.getName());

    }

    public void addPersonToQueue(final Person person) {
        PERSON_QUEUE.add(person);

    }

    public void pollPrintRetur(final Queue<Person> personQueue) {

        final List<Person> personPolled = new ArrayList<>();

        final Thread pollingThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    personPolled.add(personQueue.poll());
                    System.out.println("Person polled: " + personPolled.get(0).getName());
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });

        final Thread addingThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    System.out.println("Person added back: " + personPolled.get(0).getName());
                    personQueue.add(personPolled.get(0));
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

        });
        pollingThread.start();
        addingThread.start();

        try {
            pollingThread.join();
            addingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }
}
