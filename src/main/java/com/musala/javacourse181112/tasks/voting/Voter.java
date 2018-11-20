package com.musala.javacourse181112.tasks.voting;

public class Voter {
    public String name;
    public String EGN;
    public Votes[] votes;
    public Voter(){

    }
    public Voter(String name,String EGN,Votes[] votes)
    {
        if(EGN.length()==10)
        {
            this.name=name;
            this.EGN=EGN;
            this.votes=new Votes[votes.length];
            for(int i=0;i<votes.length;i++)
            {
                this.votes[i]=votes[i];
            }
        }
    }
}
