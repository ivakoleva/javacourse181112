package com.musala.javacourse181112.tasks.library_exercise.model;

import java.time.LocalDate;

public class Newspaper implements Item {
    private String ISBN;
    private String name;
    private String id;
    private int issue;
    private LocalDate dayOfPublishing;

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

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

}
