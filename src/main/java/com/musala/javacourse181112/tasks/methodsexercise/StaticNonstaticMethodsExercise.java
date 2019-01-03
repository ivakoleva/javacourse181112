package com.musala.javacourse181112.tasks.methodsexercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class StaticNonstaticMethodsExercise {
    private static final List<Person> PERSON_LIST = new ArrayList<>();
    private static final int MAX_LIST_SIZE = 10;

    public static void main(final String[] args) {
        for (int i = 0; i < MAX_LIST_SIZE; i++) {
            PERSON_LIST.add(new Person());
        }

        final AtomicInteger index = new AtomicInteger(0);
        PERSON_LIST.forEach(element -> element.setName("Ivan" + index.getAndIncrement()));

        final PersonService personService = new PersonService();
        final PersonService personService1 = new PersonService();

        System.out.println("Print person list");
        for (Person element : PERSON_LIST) {
            PersonService.printPersonName(element);
        }

        //add elements to queue
        for (Person element : PERSON_LIST) {
            personService.addPerson(element);
        }

        System.out.println("Poll element and add to queue");
        personService.handlePerson();
    }
}