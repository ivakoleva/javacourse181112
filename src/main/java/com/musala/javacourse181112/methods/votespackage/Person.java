package com.musala.javacourse181112.methods.votespackage;

import com.musala.javacourse181112.basics.Gender;
import com.musala.javacourse181112.votePackage.Votes;

public class Person {

    String name = new Generator().generateName();
    Vote vote;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }


}
