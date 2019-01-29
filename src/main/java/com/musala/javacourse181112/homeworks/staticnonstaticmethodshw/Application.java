package com.musala.javacourse181112.homeworks.staticnonstaticmethodshw;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Application {
    private static final List<Person> personList = new ArrayList<>();
    private static final int SIZE = 10;

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            personList.add(new Person());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        personList.forEach((i) -> i.setName("Ime" + atomicInteger.getAndIncrement()));

        final PersonService personService = new PersonService();
        final PersonService personService1 = new PersonService();

        System.out.println("Print personList");
        for (Person personElement : personList) {
            PersonService.printPersonName(personElement);
        }


        for (Person personElement : personList) {
            personService1.addPersonToQueue(personElement);

        }
        //Doesnt work properly at the moment .... adds person to the Queue from PERSONSERVICE
        // but polls from the other queue
        System.out.println("Polling persons and adding them to the queue");
        Queue<Person> personQueue = new LinkedBlockingQueue<>();
        personService1.pollPrintRetur(personQueue);

    }
}
