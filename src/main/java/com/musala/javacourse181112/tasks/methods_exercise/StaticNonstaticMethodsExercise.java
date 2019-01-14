package com.musala.javacourse181112.tasks.methods_exercise;

import java.util.ArrayList;
import java.util.List;

public class StaticNonstaticMethodsExercise {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person("" + i, "" + i));
        }
        PersonService personService1 = new PersonService();
        PersonService personService2 = new PersonService();
        for (int i = 0; i < 10; i++) {
            personService1.addPerson(people.get(i));
        }
        for (int i = 0; i < 10; i++) {
            personService2.addPerson(personService1.handlePerson());
        }

    }
}
