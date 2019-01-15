package com.musala.javacourse181112.oop.libraryexercise.model;

public class Newspaper extends AbstractItem implements Issuable{
    private Long issueNumber;

    @Override
    public Long getIssueNumber() {
        return issueNumber;
    }

    @Override
    public void setIssueNumber(Long issueNumber) {
        this.issueNumber = issueNumber;
    }
}