package com.musala.javacourse181112.tasks.votes_v0_6_exercise.service;

import com.musala.javacourse181112.tasks.votes_v0_6_exercise.model.Person;

public class PersonService {
    public Person generatePerson(final String name, final String family) {
        final Person person = new Person();
        person.setName(name);
        person.setFamily(family);
        return person;
    }
}
