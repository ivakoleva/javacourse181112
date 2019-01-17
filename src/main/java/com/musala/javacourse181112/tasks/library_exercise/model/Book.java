package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;

public class Book implements Item {
    private String ISBN;
    private String name;
    private String id;
    private LocalDate dayOfPublishing;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(final String ISBN) {
        this.ISBN = ISBN;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public LocalDate getDayOfPublishing() {
        return dayOfPublishing;
    }

    @Override
    public void setDayOfPublishing(final LocalDate dayOfPublishing) {
        this.dayOfPublishing = dayOfPublishing;
    }

    @Override
    @Deprecated
    public String getSpecialId() {
        return name + "|" + dayOfPublishing;
    }
}
