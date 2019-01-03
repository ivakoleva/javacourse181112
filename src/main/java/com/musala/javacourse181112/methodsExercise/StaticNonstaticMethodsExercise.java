package com.musala.javacourse181112.methodsExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StaticNonstaticMethodsExercise {
    private static final List<Person> personList = new ArrayList<>();
    private static final int SIZE_OF_ARRAYLIST = 10;

    public static void main(final String[] args) {

        for (int i = 0; i < SIZE_OF_ARRAYLIST; i++) {
            personList.add(new Person());
        }

        final AtomicInteger index = new AtomicInteger(0);
        personList.forEach((element) -> element.setPersonName("Ivan" + index.getAndIncrement()));

        final PersonService personService = new PersonService();
        final PersonService personService1 = new PersonService();

        System.out.println("Print person list");
        for (Person element : personList) {
            PersonService.printPersonName(element);
        }

        //add elements to queue
        for (Person element : personList) {
            personService.addPersonToQueue(element);
        }

        System.out.println("Poll element and add to queue");
        personService.pollAndAddElementToQueueWithThreads();
    }
}
