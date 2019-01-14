package com.musala.javacourse181112.tasks.library_exercise.model;

public class Book implements Item {
    private String ISBN;
    private String name;
    private String id;

    /*public Book(String ispn, String name) {
        this.ISBN = ispn;
        this.name = name;
    }*/

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
