package com.musala.javacourse181112.tasks.libraryexercise.model;

public interface Item extends Entity {
    String getIsbn();

    void setIsbn(String isbn);

    String getName();

    void setName(String name);
}
