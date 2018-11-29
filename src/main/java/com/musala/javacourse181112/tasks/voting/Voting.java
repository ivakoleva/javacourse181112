package com.musala.javacourse181112.tasks.voting;

public class Voting {
    public static Voter[] voters;
    public static void main(String[] args){
        System.out.println("Welcome!");
        int i=1;
        Votes votes[]={Votes.YES,Votes.NO,Votes.YES};
        voters=new Voter[3];
        voters[0]=new Voter("a","1",votes);
        voters[1]=new Voter("d","2",votes);
        voters[2]=new Voter("s","3",votes);
        Q(i++,"Is it snowing today?");
        Q(i++,"Do you want rather to be snowing today?");
    }
    private static void Q(int n,String q){
        System.out.println("Q"+n+": "+q);
        int brYES=0,brNO=0;
        for(int i=0;i<3;i++)
        {
            if(voters[i].votes[n-1]==Votes.YES)
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

}
