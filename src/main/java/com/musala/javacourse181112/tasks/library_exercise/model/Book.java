package com.musala.javacourse181112.tasks.library_exercise.model;

public class Book implements Item {
    String isbn;
    String name;

    public Book(String ispn, String name) {
        this.isbn = ispn;
        this.name = name;
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
