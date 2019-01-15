package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;

public class Book implements Item {
    private String ISBN;
    private String name;
    private String id;
    private LocalDate dayOfPublishing;
    private int issue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public LocalDate getDayOfPublishing() {
        return dayOfPublishing;
    }

    @Override
    public void setDayOfPublishing(LocalDate dayOfPublishing) {
        this.dayOfPublishing = dayOfPublishing;
    }

    @Override
    public String getSpecialId() {
        return name + "|" + dayOfPublishing;
    }

    @Override
    public int getIssue() {
        return issue;
    }

    @Override
    public void setIssue(int issue) {
        setIssue(issue);
    }
}
