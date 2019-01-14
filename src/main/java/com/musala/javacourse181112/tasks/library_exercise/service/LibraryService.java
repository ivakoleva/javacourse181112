package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.util.List;

public class LibraryService {

    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people) {
        final Library library = new Library();
        library.setItems(items);
        library.setName(name);
        library.setPeople(people);
        return library;
    }

    public Person generatePerson(Role role, String name, String id) {
        Person person = new Person();
        person.setRole(role);
        person.setName(name);
        person.setId(id);
        person.subscribe();
        return person;
    }

    public Book generateBook(String ispn, String name) {
        Book book = new Book();
        book.setISBN(ispn);
        book.setName(name);
        return book;
    }
}
