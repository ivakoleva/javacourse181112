package com.musala.javacourse181112.tasks.methods_exercise;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PersonService {
    private BlockingQueue<Person> blockingQueue;

    PersonService() {
        blockingQueue = new LinkedBlockingQueue<>();
    }

    public void addPerson(Person person) {
        addToQueue(person);
    }

    public Person handlePerson() {
        Person person = blockingQueue.poll();
        printPersonNamesToStdout(person);
        return person;
    }

    private void addToQueue(Person person) {
        blockingQueue.offer(person);
    }

    public static void printPersonNamesToStdout(Person person) {
        System.out.println(person.getName());
    }

}
