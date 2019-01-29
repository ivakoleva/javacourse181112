package com.musala.javacourse181112.oop.libraryexercise;

import com.musala.javacourse181112.oop.libraryexercise.model.Item;
import com.musala.javacourse181112.oop.libraryexercise.model.ItemRent;
import com.musala.javacourse181112.oop.libraryexercise.model.Library;
import com.musala.javacourse181112.oop.libraryexercise.model.Person;

import java.util.List;

public class LibraryService {
    public Library generateLibrary(final String name, final String address,
                                   final List<Person> personList, final List<Item> itemList, final List<ItemRent> itemRentList) {
        final Library library = new Library();
        library.setName(name);
        library.setAddress(address);
        library.setPersonList(personList);
        library.setItemList(itemList);
        library.setItemRentList(itemRentList);
        return library;
    }
}
