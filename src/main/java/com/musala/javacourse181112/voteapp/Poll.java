package com.musala.javacourse181112.voteapp;

// :)
public class Poll {
    public static void main(final String[] args) {
        final int maxVoters = 30;
        final int maxQuestions = 2;

        final String[][] voters = new String[maxVoters][maxQuestions];

        System.out.println("Welcome!!! \nThe first question is: \nDo you like pizza?");

        // populate data
        for (int j = 0; j < maxQuestions; j++) {
            for (int i = 0; i < maxVoters; i++) {
                voters[i][j] = String.valueOf((i % 2) == 0 ? Vote.YES : Vote.NO);
            }
        }

        // count votes
        int votesYes = 0, votesNo = 0;
        for (int i = 0; i < maxVoters; i++) {
            if (String.valueOf(Vote.YES).equals(voters[i][0])) {
                votesYes++;
            } else {
                votesNo++;
            }
        }
        System.out.println(maxVoters + " voted out of which " + votesYes + " voted " + Vote.YES + " \nThe remaining " + votesNo + " voted " + Vote.NO + ".");

        // TODO: method encapsulation of common code
        System.out.println("\nThe second question is: \nIs it snowing?");
        votesYes = votesNo = 0;
        for (int i = 0; i < maxVoters; i++) {
            if (voters[i][1].equals(String.valueOf(Vote.YES))) {
                votesYes++;
            } else {
                votesNo++;
            }
        }
        System.out.println(maxVoters + " voted out of which " + votesYes + " voted Yes \nThe remaining " + votesNo + " voted NO.");

        System.exit(0);
    }
}

