package com.musala.javacourse181112.tasks.libraryexercise_v0_2.model;

public interface Item extends Entity {
    String getIsbn();

    void setIsbn(String isbn);

    String getName();

    void setName(String name);
}
