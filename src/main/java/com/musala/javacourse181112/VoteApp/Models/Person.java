package com.musala.javacourse181112.VoteApp.Models;

import com.musala.javacourse181112.enums.Vote;

import java.io.Serializable;

public class Person implements Serializable {
    private final String firstName;
    private final String lastName;
    private final int age;
    private Vote vote;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public final String getFirstName() {
        return firstName;
    }
    public final String getLastName() {
        return lastName;
    }
    public final int getAge() {
        return age;
    }
    public Vote getVote() { return vote; }
    public void vote(Vote vote){
        this.vote = vote;
    }
}
