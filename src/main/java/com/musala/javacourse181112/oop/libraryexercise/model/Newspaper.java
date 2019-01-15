package com.musala.javacourse181112.oop.libraryexercise.model;

public class Newspaper extends AbstractItem implements Issuable {
    private int issue;
    @Override
    public void setIssue(int issue) {
        this.issue = issue;

    }

    @Override
    public int getIssue() {
        return issue;
    }


}