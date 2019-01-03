package com.musala.javacourse181112.tasks.methodsexercise;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

class PersonService {
    private final BlockingQueue<Person> personQueue = new LinkedBlockingQueue<>();

    void addPerson(final Person person) {
        personQueue.add(person);
    }

    Person handlePerson() {
        final Person person = personQueue.poll();
        printPersonName(person);
        return person;
    }

    @Deprecated
    void pollAndAddElementToQueueWithThreads() {
        final AtomicReference<Person> personAtomicReference = new AtomicReference<>();
        //final Person[] pollPerson = new Person[1];

        // TODO: thread executor
        final Thread producerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    personAtomicReference.set(personQueue.poll());
                    assert personAtomicReference.get() != null;
                    //pollPerson[0] = personQueue.poll();
                    //assert pollPerson[0] != null;
                    Thread.sleep(1000);
                    System.out.println(personAtomicReference.get().getName());
                    //System.out.println(pollPerson[0].getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        final Thread consumerThread = new Thread(() -> {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(1000);
                    personQueue.add(personAtomicReference.get());
                    //personQueue.add(pollPerson[0]);
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
        //System.exit(0);
    }

    static void printPersonName(final Person person) {
        System.out.println(person.getName());
    }
}