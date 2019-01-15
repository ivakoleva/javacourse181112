package com.musala.javacourse181112.oop.libraryexercise.model;

import com.musala.javacourse181112.oop.libraryexercise.Issueable;

public class Newspaper extends AbstractItem implements Issueable {

    public int issue;

    @Override
    public int getIssue() {
        return issue;
    }

    @Override
    public void setIssue(int issue) {
        this.issue = issue;
    }
}