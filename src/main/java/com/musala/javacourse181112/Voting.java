package com.musala.javacourse181112;

public class Voting {
    public static void main(String[] args) {
        String [][] votes=new String [2][30];
        System.out.println("Question 1 Do You like snow");

        System.out.println(votes[0][0]="yes");
        System.out.println(votes[0][1]="no");
        System.out.println(votes[0][2]="yes");
System.out.println("Question 2:Do you want it to snow today?");
        System.out.println( votes[1][0]="yes");
        System.out.println(votes[1][1]="no");
        System.out.println(votes[1][2]="no");
votesCounter(votes);
    }
   public static int votesCounter(String [][] vote){
        return 0;
   }
}
