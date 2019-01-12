package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;

    private final List<Person> personList = new ArrayList<>();
    private final List<Item> itemsList = new ArrayList<>();
    //final List<Book> bookList = new ArrayList<>();
    //final List<Magazine> magazineList = new ArrayList<>();
    //final List<Newspaper> newspaperList = new ArrayList<>();

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
