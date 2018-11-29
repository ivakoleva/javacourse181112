package com.musala.javacourse181112.votePackage;

public class Person {
    String name;
    Votes vote;
    String EGN;
    public Person(){}

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Votes getVote() {
        return vote;
    }

    public void setVote(Votes vote) {
        this.vote = vote;
    }


}
