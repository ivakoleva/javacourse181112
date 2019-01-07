package com.musala.javacourse181112.tasks.voteapplication;

public class Person {
    //private Vote vote;
    private String name;
    private String egn;

    public Person(final String egn, final String name) {
        this.egn = egn;
        this.name = name;
    }

    String getName() {
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
