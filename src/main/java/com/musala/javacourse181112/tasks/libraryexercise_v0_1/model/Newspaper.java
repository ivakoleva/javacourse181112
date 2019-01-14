package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import java.time.LocalDate;

public class Newspaper implements Inventory {
    private String name;
    private String ISBN;
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public long getID() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
