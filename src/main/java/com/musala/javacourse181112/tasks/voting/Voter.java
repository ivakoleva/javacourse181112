package com.musala.javacourse181112.tasks.voting;

public class Voter {
    public String name;
    public String EGN;
    public Votes[] votes;
    Voter(){

    }
    Voter(String name,String EGN,Votes[] votes)
    {
        if(EGN.length()==10)
        {
            this.name=name;
            this.EGN=EGN;
            this.votes=votes;
        }
    }
}
