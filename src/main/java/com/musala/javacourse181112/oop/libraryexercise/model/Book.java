package com.musala.javacourse181112.oop.libraryexercise.model;

public class Book extends AbstractItem implements Issuable {
    private Integer uniqueId;
    @Override
    public Integer getUniqueId() {
        return uniqueId;
    }

    @Override
    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }
}
