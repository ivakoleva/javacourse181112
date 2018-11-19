package com.musala.javacourse181112.tasks.voting;

public class Voting {
    public static void main(String[] args){
        System.out.println("Welcome!");
        int i=1;
        Q(i++,"Is it snowing today?");
        Q(i++,"Do you want rather to be snowing today?");
    }
    private static void Q(int n,String q){
        System.out.println("Q"+n+": "+q);
        Votes votes[]={Votes.YES,Votes.NO,Votes.YES};
        int brYES=0,brNO=0;
        for(int i=0;i<3;i++)
        {
            if(votes[i]==Votes.YES)
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
