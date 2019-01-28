package com.musala.javacourse181112.oop.libraryexercise;

import com.musala.javacourse181112.oop.libraryexercise.model.Person;

public class TestPersonGenerator {
    public Person generatePerson(final String name, final String egn) {
        final Person person = new Person();
        person.setName(name);
        person.setEgn(egn);
        return person;
    }
}
