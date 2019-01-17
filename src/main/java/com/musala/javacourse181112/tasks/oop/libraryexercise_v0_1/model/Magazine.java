package com.musala.javacourse181112.tasks.oop.libraryexercise_v0_1.model;

public class Magazine implements Inventory {
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

    public long getId() {
        return id;
    }

    @Override
    public long getID() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
