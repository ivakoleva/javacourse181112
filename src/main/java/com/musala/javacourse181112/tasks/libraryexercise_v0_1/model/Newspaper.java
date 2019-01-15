package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

public class Newspaper extends AbstractItem implements Issuable{
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