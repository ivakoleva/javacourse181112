package com.musala.javacourse181112.oop.libraryexercise.model;

public class Newspaper extends AbstractItem implements Issueable {
    public int issue;

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
}