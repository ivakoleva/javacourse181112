package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.items;


import com.musala.javacourse181112.tasks.libraryexercise_v0_1.model.Rentable;

public class Newspaper implements Rentable {
    private String name;
    private String isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String setIsbn(String isbn) {
        this.isbn = isbn;
        return isbn;
    }

}
