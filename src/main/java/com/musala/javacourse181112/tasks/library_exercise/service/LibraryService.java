package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.time.LocalDate;
import java.util.List;

public class LibraryService {

    private ItemGenerator itemGenerator = new ItemGenerator();
    private PersonService personService = new PersonService();

    //generating library
    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people) {
        final Library library = new Library();

        library.setItems(items);
        library.setName(name);
        library.setPeople(people);

        IssueHandler issueHandler = new IssueHandler();
        issueHandler.checkAndCorrect(items);
        library.setIssueHandler(issueHandler);

        return library;
    }

    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people,
                                   final IssueHandler issueHandler) {
        final Library library = new Library();

        library.setItems(items);
        library.setName(name);
        library.setPeople(people);

        issueHandler.checkAndCorrect(items);
        library.setIssueHandler(issueHandler);

        return library;
    }

    //adding people
    public void addPerson(Library library, Person person) {
        library.getPeople().add(person);
    }

    public void addPerson(Library library, Role role, String name, String id) {
        addPerson(library, personService.generatePerson(role, name, id));
    }

    //adding items
    private <T extends Item> void addItem(Library library, T item) {
        library.getItems().add(item);
    }

    //adding books
    public void addBook(Library library, Book book) {
        addItem(library, book);
    }

    public void addBook(Library library, String isbn, String name, String id, LocalDate dayOfPublishing) {
        itemGenerator.setIssueHandler(library.getIssueHandler());
        addBook(library, itemGenerator.generateBook(isbn, name, id, dayOfPublishing));
    }

    //adding magazines
    public void addMagazine(Library library, Magazine magazine) {
        addItem(library, magazine);
    }

    public void addMagazine(Library library, String isbn, String name, String id, LocalDate dayOfPublishing) {
        itemGenerator.setIssueHandler(library.getIssueHandler());
        addMagazine(library, itemGenerator.generateMagazine(isbn, name, id, dayOfPublishing));
    }

    //adding newspapers
    public void addNewspaper(Library library, Newspaper newspaper) {
        addItem(library, newspaper);
    }

    public void addNewspaper(Library library, String isbn, String name, String id, LocalDate dayOfPublishing) {
        itemGenerator.setIssueHandler(library.getIssueHandler());
        addNewspaper(library, itemGenerator.generateNewspaper(isbn, name, id, dayOfPublishing));
    }
}
