package com.musala.javacourse181112.oop.votesexercise.service;

import com.musala.javacourse181112.oop.votesexercise.model.Person;

import java.time.LocalDate;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class PersonService {
    public Person generatePerson(final String name,
                                 final String family,
                                 final LocalDate dateOfBirth) {
        final Person person = new Person();
        person.setName(name);
        person.setFamily(family);
        person.setDateOfBirth(dateOfBirth);
        return person;
    }
}
