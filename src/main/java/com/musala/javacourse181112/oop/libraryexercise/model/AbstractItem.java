package com.musala.javacourse181112.oop.libraryexercise.model;

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
