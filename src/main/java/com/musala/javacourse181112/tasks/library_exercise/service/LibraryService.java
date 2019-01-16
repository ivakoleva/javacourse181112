package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// TODO:
//  redundant proxy type-strict methods of generic addItem() cleanup
public class LibraryService {

    final private PersonService personService = new PersonService();

    //generating library
    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people) {

        return generateLibrary(name, items, people, null);
    }

    public Library generateLibrary(final String name,
                                   final List<Item> items,
                                   final List<Person> people,
                                   final ItemService itemService) {
        assert name != null;

        final Library library = new Library();

        library.setName(name);

        if (items != null) {
            library.setItems(items);
        } else {
            library.setItems(new ArrayList<>());
        }

        if (people != null) {
            library.setPeople(people);
        } else {
            library.setPeople(new ArrayList<>());
        }

        if (itemService != null) {
            library.setItemService(itemService);
        } else {
            library.setItemService(new ItemService());
        }
        return library;
    }

    //adding people
    public void addPerson(final Library library, final Person person) {
        assert library != null;
        assert person != null;

        if(library.getPeople() == null) {
            library.setPeople(new ArrayList<>());
        }
        library.getPeople().add(person);
    }

    public void addPerson(final Library library, final String id, final String name, final Role role) {
        addPerson(library, personService.generatePerson(id, name, role));
    }

    //adding items
    private <T extends Item> void addItem(final Library library, final T item) {
        assert library != null;
        assert item != null;

        if(library.getItems() == null) {
            library.setItems(new ArrayList<>());
        }
        library.getItems().add(item);
    }

    //adding books
    public void addBook(final Library library, final Book book) {
        addItem(library, book);
    }

    public void addBook(final Library library, final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        addBook(library, library.getItemService().generateBook(isbn, name, id, dayOfPublishing));
    }

    //adding magazines
    public void addMagazine(final Library library, final Magazine magazine) {
        addItem(library, magazine);
    }

    public void addMagazine(final Library library, final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        addMagazine(library, library.getItemService().generateMagazine(isbn, name, id, dayOfPublishing));
    }

    //adding newspapers
    public void addNewspaper(final Library library, final Newspaper newspaper) {
        addItem(library, newspaper);
    }

    public void addNewspaper(final Library library, final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        addNewspaper(library, library.getItemService().generateNewspaper(isbn, name, id, dayOfPublishing));
    }
}

