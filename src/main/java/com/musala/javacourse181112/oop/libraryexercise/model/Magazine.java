package com.musala.javacourse181112.oop.libraryexercise.model;

//<<<<<<< HEAD
public class Magazine extends AbstractItem implements Issueable {
    private int issue;

    @Override
    public int getIssue() {
        return issue;
    }

    @Override
    public void setIssue(int issue) {
        this.issue = issue;
/*=======
public class Magazine extends AbstractItem {
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;

>>>>>>> origin/master
    }*/

}
}
