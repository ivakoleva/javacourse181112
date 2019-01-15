package com.musala.javacourse181112.oop.libraryexercise.model;

public class Magazine extends AbstractItem implements Issueable {
    private int issue;

    @Override
    public int getIssue() {
        return issue;
    }

    @Override
    public void setIssue(int issue) {
        this.issue = issue;
    }

}
