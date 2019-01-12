package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

public class Newspaper implements Item {
    private String ISBN;
    private String name;
    private long id;

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
