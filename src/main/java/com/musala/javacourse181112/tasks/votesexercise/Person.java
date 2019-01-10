package com.musala.javacourse181112.tasks.votesexercise;

public class Person {
    private int[] idNumber;
    private String Name;
    private Vote voteQuestion1;
    private Vote voteQuestion2;

    public int[] getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int[] idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Vote getVoteQuestion1() {
        return voteQuestion1;
    }

    public void setVoteQuestion1(Vote voteQuestion1) {
        this.voteQuestion1 = voteQuestion1;
    }

    public Vote getVoteQuestion2() {
        return voteQuestion2;
    }

    public void setVoteQuestion2(Vote voteQuestion2) {
        this.voteQuestion2 = voteQuestion2;
    }
}
