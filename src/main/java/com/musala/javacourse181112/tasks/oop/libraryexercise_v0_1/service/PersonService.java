package com.musala.javacourse181112.tasks.oop.libraryexercise_v0_1.service;

import com.musala.javacourse181112.oop.votesexercise.model.Person;
import com.musala.javacourse181112.tasks.oop.libraryexercise_v0_1.model.Role;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public List<Person> setClientRoleToPerson(final Person person) {
        List<Person> clientsList = new ArrayList<>();
        person.setRole(Role.CLIENT);
        clientsList.add(person);
        return clientsList;
    }

    public List<Person> setEmployeeRoleToPerson(final Person person) {
        List<Person> employeeList = new ArrayList<>();
        person.setRole(Role.EMPLOYEE);
        employeeList.add(person);
        return employeeList;
    }
}
