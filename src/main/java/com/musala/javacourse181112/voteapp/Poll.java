package com.musala.javacourse181112.voteapp;

// :)
public class Poll {
    private static int votesYes, votesNo, i,j;
    private static final int maxVoters = 30;
    private static final int voterQualities = 3;
    private static final int voteAttribute = 2;

    private static final Object[][] voters =new Object[maxVoters][voterQualities];
    public static void main(final String[] args) {

        System.out.println("Welcome!!!");
        populateVoters(voters);
        PrintIn(1, "Do you like pizza?");
        VoteCounter(maxVoters, voters,voteAttribute);
        PrintIn(2, "Do you like snow?");
        VoteCounter(maxVoters, voters,voteAttribute);

    }

    //Question Printer
    private static void PrintIn(int questionNumber, String questionContent){
        System.out.println("\nQuestion number: " + questionNumber + "  "+ questionContent);
    }

    //Vote counter and printer
    private static void VoteCounter(int maxVoters, Object[][] voters, int m){
        votesYes = votesNo = 0;
        for (i = 0; i < maxVoters; i++) {
            if (String.valueOf(Vote.YES).equals(voters[i][m])) {
                votesYes++;
            } else {
                votesNo++;
            }
        }
    System.out.println(maxVoters + " voted out of which " + votesYes + " voted " + Vote.YES + " \nThe remaining " + votesNo + " voted " + Vote.NO + ".");
    }
    
    //Voter populator
    private static void populateVoters(Object[][] voters){
        long EGN = 8902034520L;
        for ( j = 0; j < voterQualities; j++) {
            for ( i = 0; i < maxVoters; i++) {
               if(j == 0){
                   voters[i][j] = ++EGN;}
                   else if (j==1){
                   voters[i][j] = "Pesho";
               }
               else if(j==2){
                   voters[i][j] = String.valueOf((i % 2) == 0 ? Vote.YES : Vote.NO);
               }
            }
        }
    }
}

