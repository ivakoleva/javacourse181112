package com.musala.javacourse181112.tasks.voting;

public class Voter {
    public String name;
    public String EGN;
    public Votes[] votes;
    Voter(){
    }

    Voter(String name, String EGN) {
        this(name, EGN, null);
    }
    Voter(String name,String EGN,Votes[] votes)
    {
        int numbersInEGN = 0;
        for (int i = 0; i < EGN.length(); i++) {
            if (Character.isDigit(EGN.charAt(i))) {
                numbersInEGN++;
            }
        }
        if (numbersInEGN == 10)
        {
            this.name=name;
            this.EGN=EGN;
            this.votes=votes;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public Votes[] getVotes() {
        return votes;
    }

    public void setVotes(Votes[] votes) {
        this.votes = votes;
    }
}
