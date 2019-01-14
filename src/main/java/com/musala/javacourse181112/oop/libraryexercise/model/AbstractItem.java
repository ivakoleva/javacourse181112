package com.musala.javacourse181112.oop.libraryexercise.model;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public abstract class AbstractItem extends BaseEntity implements Item {
    private String isbn;
    private String name;

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
