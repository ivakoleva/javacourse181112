package com.musala.javacourse181112.tasks;

// TODO: needs to be implemented
@Deprecated
public class VotesVersionTwoApplication {

    public static void main(final String[] args) {
        //final String[][] vote = new String[30][30];

        System.out.println("Welcome");
        final String[] questions = {"Do you like ice cream", "Do you drink coffee"};

        int yesCount = 0;
        int noCount = 0;
        // TODO: populate vote array instead
        for (int i = 0; i < 2; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < 30; j++) {
                if ((i - j) % 2 == 0) {
                    noCount++;
                    System.out.println("Voter " + j + " voted: " + Vote.NO);
                } else {
                    yesCount++;
                    System.out.println("Voter " + j + " voted: " + Vote.YES);
                }
            }

           /* if (i % 2 == 0) {
                for (int j = 0; j < vote.length; j++) {
                    if (j % 2 == 0) {
                        vote[j][0] = String.valueOf(Vote.NO);
                        noCount++;
                    } else {
                        vote[j][0] = String.valueOf(voteYes);
                        yesCount++;
                    }

                    System.out.println("Voter " + j + " voted: " + vote[j][0]);
                }
            } else {
                for (int j = 0; j < vote.length; j++) {
                    if (j % 2 == 0) {
                        vote[j][0] = String.valueOf(voteYes);
                        yesCount++;
                    } else {
                        vote[j][0] = String.valueOf(Vote.NO);
                        noCount++;
                    }

                    System.out.println("Voter " + j + " voted: " + vote[j][0]);
                }
            }*/
            System.out.println();
        }

        System.out.println("YES - " + yesCount + " NO - " + noCount);
    }
}