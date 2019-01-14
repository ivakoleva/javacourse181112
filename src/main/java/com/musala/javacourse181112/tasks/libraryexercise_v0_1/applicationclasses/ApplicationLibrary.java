package com.musala.javacourse181112.tasks.libraryexercise_v0_1.applicationclasses;

import com.musala.javacourse181112.tasks.libraryexercise_v0_1.supportclasses.*;

import java.util.List;

public class ApplicationLibrary {
    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people){
        final Library library = new Library();
        library.setItems(items);
        library.setName(name);
        library.setPeople(people);
        return library;
    }

    public Person generatePerson (Role role, String name, String id){
        Person person = new Person();
        person.setRole(role);
        person.setName(name);
        person.setId(id);
        person.subscribe();
        return person;
    }

    public Book generateBook(String ispn, String name){
        Book book = new Book();
        book.setISBN(ispn);
        book.setName(name);
        return book;
    }
}
