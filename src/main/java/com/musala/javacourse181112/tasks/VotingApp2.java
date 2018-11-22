package com.musala.javacourse181112.tasks;

// keep it
public class VotingApp2 {
    public static void main(final String[] args) {
        System.out.println("Please vote now, answer the following questions:");

        // 2 questions,3 voters
        final Vote[][] voterArray = new Vote[2][30];

        // hardcode  person votes (voted yes/no) for the 2 questions
        /*final Vote votersAnswer1 = Vote.YES;
        final Vote votersAnswer2 = Vote.NO;*/

        final String voterNameArray[] = {"Pesho", "Strahil", "Stanko"};
        final String voterEgnArray[] = {"6509111723", "78200801245", "8909102314"};

        //assign votes to array
        voterArray[0][0] = Vote.YES;
        voterArray[0][1] = Vote.NO;
        voterArray[0][2] = Vote.YES;
        voterArray[1][0] = Vote.NO;
        voterArray[1][1] = Vote.NO;
        voterArray[1][2] = Vote.YES;

        //question 1
        System.out.println("Did you like football ?");
        for (int i = 0; i <= voterArray.length; i++) {
            System.out.println(voterNameArray[i] + "\t" + voterEgnArray[i] + " \t" + voterArray[0][i]);

        }

        //question 2
        System.out.println("\nDid you play football ?");
        for (int i = 0; i <= voterArray.length; i++) {
            System.out.println(voterNameArray[i] + "\t " + voterEgnArray[i] + " \t" + voterArray[1][i]);
        }

        //implement votes counting
        int countNo = 0;
        int countYes = 0;
        for (Vote[] aVoterArray : voterArray) {
            for (Vote anAVoterArray : aVoterArray) {
                if (Vote.YES.equals(anAVoterArray)) {
                    countYes++;
                } else if (Vote.NO.equals(anAVoterArray)) {
                    countNo++;
                } else {
                    // not voted
                }
            }
        }

        //print count of Yes or No answers
        System.out.println("The Yes answers for first question  are: " + countYes);
        System.out.println("The No answers are for second question are: " + countNo);
    }
}



