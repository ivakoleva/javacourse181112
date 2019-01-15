package com.musala.javacourse181112.tasks.libraryexercise_v0_1.services;

import com.musala.javacourse181112.oop.libraryexercise.model.Person;
import com.musala.javacourse181112.oop.libraryexercise.model.Role;

import javax.management.relation.RoleStatus;
import java.util.ArrayList;
import java.util.List;

public class LibraryServicesImplementation implements LibraryServices {

    List<Person> personList = new ArrayList<>();
    @Override
    public List<Person> addPerson(Person person) {
        personList.add(person);
        return personList;
    }
}
