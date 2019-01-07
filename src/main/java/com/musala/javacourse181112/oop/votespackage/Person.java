package com.musala.javacourse181112.methods.votespackage;

public class Person {
    private static final NameGenerator NAME_GENERATOR = new NameGenerator();

    private String name = NAME_GENERATOR.generate();
    private Vote vote;

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

    // in favor of anemic data model
    /*@Deprecated
    public Person(String name) {
        this.name = name;
    }*/
}
