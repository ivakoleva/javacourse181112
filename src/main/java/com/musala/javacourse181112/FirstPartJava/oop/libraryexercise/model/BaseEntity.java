package com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public class BaseEntity implements Entity {
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
