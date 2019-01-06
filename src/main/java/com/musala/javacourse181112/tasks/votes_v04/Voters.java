package com.musala.javacourse181112.tasks.votes_v04;

public class Voters extends Vote{
    private String name;
    private String egn;

    public Voters(boolean answer, int question, String name, String egn) {
        super(answer, question);
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
