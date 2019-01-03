package com.musala.javacourse181112.methodsExercise;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class PersonService {
    private final BlockingQueue<Person> personQueue = new LinkedBlockingQueue<>();

    static void printPersonName(final Person person) {
        System.out.println(person.getPersonName());
    }

    void addPersonToQueue(final Person person) {
        personQueue.add(person);
    }

    void pollAndAddElementToQueueWithThreads() {
        final Person[] pollPerson = new Person[1];

        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    pollPerson[0] = personQueue.poll();
                    assert pollPerson[0] != null;
                    Thread.sleep(1000);
                    System.out.println(pollPerson[0].getPersonName());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(1000);
                    personQueue.add(pollPerson[0]);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            producerThread.interrupt();
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
