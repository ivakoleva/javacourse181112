package com.musala.javacourse181112.tasks.library_exercise.model;

public class Newspaper implements Item {
    String isbn;
    String name;

    public Newspaper(String isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public Newspaper(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getISBN() {
        return isbn;
    }
}
