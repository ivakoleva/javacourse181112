package com.musala.javacourse181112.tasks.voting;

import java.util.ArrayList;
import java.util.List;

public class Voting {
    public List<Voter> voters;

    public Voting() {
        voters = new ArrayList<>();
    }
    public static void main(String[] args){
        System.out.println("Welcome!");
        int i=1;

        Votes votes[]={Votes.YES,Votes.NO,Votes.YES};
        Voting v = new Voting();
        Voter voter1 = new Voter("a", "1234567890", votes);
        Voter voter2 = new Voter("aa", "1234567891", votes);
        Voter voter3 = new Voter("aaa", "1234567892", votes);
        v.addVoter(voter1);
        v.addVoter(voter2);
        v.addVoter(voter3);
        Q(v.getListVoters(), i++, "Is it snowing today?");
        Q(v.getListVoters(), i++, "Do you want rather to be snowing today?");
    }

    private static void Q(List<Voter> voters, int n, String q) {
        System.out.println("Q"+n+": "+q);
        int brYES=0,brNO=0;
        for(int i=0;i<3;i++)
        {
            if (voters.get(i).votes[n - 1] == Votes.YES)
            {
                brYES++;
            }
            else
            {
                brNO++;
            }
        }
        System.out.println("\tYES= "+brYES+"\n\tNO= "+brNO);
    }

    public void addVoter(Voter voter) {
        voters.add(voter);
    }

    public List<Voter> getListVoters() {
        return this.voters;
    }
}
