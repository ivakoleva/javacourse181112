package com.musala.javacourse181112;

public class Voting {
    public static void main(String[] args){
        System.out.println("Welcome!");
        Q1();
        Q2();
    }
    private static void Q1(){
        System.out.println("Q1:...?");
        boolean votes[]={true,false,true};
        int brTrue=0,brFalse=0;
        for(int i=0;i<3;i++)
        {
            if(votes[i])
            {
                brTrue++;
            }
            else
            {
                brFalse++;
            }
        }
        System.out.println("Q1:\n\tTrues= "+brTrue+"\n\tFalses= "+brFalse);
    }
    private  static void Q2(){
        System.out.println("Q2:...?");
        boolean votes[]={false,false,true};
        int brTrue=0,brFalse=0;
        for(int i=0;i<3;i++)
        {
            if(votes[i])
            {
                brTrue++;
            }
            else
            {
                brFalse++;
            }
        }
        System.out.println("Q2:\n\tTrues= "+brTrue+"\n\tFalses= "+brFalse);
    }
}
