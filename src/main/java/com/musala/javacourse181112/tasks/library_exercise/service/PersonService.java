package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Person;
import com.musala.javacourse181112.tasks.library_exercise.model.Role;

import java.util.ArrayList;

public class PersonService {

    public Person generatePerson(Role role, String name, String id) {
        Person person = new Person();
        person.setRole(role);
        person.setName(name);
        person.setId(id);
        person.setRentedItems(new ArrayList<>());
        person.subscribe();
        return person;
    }

}
