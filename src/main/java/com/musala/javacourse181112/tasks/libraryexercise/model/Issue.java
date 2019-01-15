package com.musala.javacourse181112.tasks.libraryexercise.model;

public class Issue {

    private String specialId;
    private int issueNumber;

    public String getName() {
        return specialId.substring(0, specialId.indexOf('|'));
    }

    public String getDate() {
        return specialId.substring(specialId.indexOf('|') + 1);
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }


}
