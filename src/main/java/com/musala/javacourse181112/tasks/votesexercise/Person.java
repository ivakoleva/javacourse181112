package com.musala.javacourse181112.tasks.votesexercise;

class Person {
    private String name;
    private Vote vote;


    public Person(){}
    public Person(String name){
        this.name=name;
    }
    public Person(String name,Vote vote){
        this.name=name;
        this.vote=vote;
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

    @Override
    public String toString() {
        return ""+ name + "Vote=" + vote;
    }
}
