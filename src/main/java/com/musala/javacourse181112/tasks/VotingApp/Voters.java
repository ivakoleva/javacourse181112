package com.musala.javacourse181112.tasks.VotingApp;

public class Voters extends Vote {

    String name;
    String egn;

    public Voters(boolean answer, int questionNumber, String name, String egn) {
        super(answer, questionNumber);
        this.name = name;
        this.egn = egn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }


}
