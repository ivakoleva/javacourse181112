package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Person;
import com.musala.javacourse181112.tasks.library_exercise.model.Role;

import java.time.LocalDate;
import java.util.ArrayList;

public class PersonService {
    public Person generatePerson(final String id, final String name, final Role role) {
        final Person person = new Person();
        person.setRole(role);
        person.setName(name);
        person.setId(id);
        person.setRentedItems(new ArrayList<>());
        person.setSubscribedUntil(LocalDate.now().plusMonths(1L));
        return person;
    }
}