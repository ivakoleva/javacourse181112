package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.Votes;

public class VotesVersionTwoApplication {

    public static void main(String[] args) {

        String[][] vote = new String[30][30];
        VoteEnum voteEnumNo = VoteEnum.NO;
        VoteEnum voteEnumYes = VoteEnum.YES;

        System.out.println("Welcome ");
        String[] questions = {"Do you like ice cream", "Do you drink coffee"};

        int yesCount = 0;
        int noCout = 0;
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            if(i % 2 == 0) {


                for (int voter = 0; voter < vote.length; voter++) {
                    if (voter % 2 == 0) {
                        vote[voter][0] = String.valueOf(voteEnumNo);
                        noCout++;
                    } else {
                        vote[voter][0] = String.valueOf(voteEnumYes);
                        yesCount++;
                    }

                    System.out.println("Voter " + voter + " voted: " + vote[voter][0]);
                }
            }else {
                for (int j = 0; j < vote.length; j++) {
                    if (j % 2 == 0) {
                        vote[j][0] = String.valueOf(voteEnumYes);
                        yesCount++;
                    } else {
                        vote[j][0] = String.valueOf(voteEnumNo);
                        noCout++;
                    }

                    System.out.println("Voter " + j + " voted: " + vote[j][0]);
                }
            }
            System.out.println();
        }

        System.out.println("YES - " + yesCount + " NO - " + noCout);



    }
    }

