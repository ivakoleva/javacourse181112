package com.musala.javacourse181112.VoteApp.Models;

import com.musala.javacourse181112.VoteApp.VoteProgram;

import java.io.Serializable;
import java.util.*;

public class Poll implements Serializable {
    private final String Question;
    private final Date Date;
    private Person[] Voters;

    public Poll(String Question, Date date, int voteGivers) {
        this.Question = Question;
        this.Date = date;
        this.Voters = new Person[voteGivers];
    }

    public String getQuestion() {
        return Question;
    }

    public Date getDate() {
        return Date;
    }

    public Person[] getVoters() {
        return Voters;
    }

}
