package com.musala.javacourse181112;

import java.util.Arrays;

public class VotesApplication {
    public static void main(final String[] args) {
        final String[] questions = {
                "Do you follow the news?",
                "Do you think that Valeri Simeonov should resign?"
        };
        final String[][] votes = {
                {"yes", "no", "yes"},
                {"yes", "yes", "no"}
        };
        //System.out.println(Arrays.deepToString(questions) + Arrays.deepToString(votes));

        //voteCounter(); //- not finished
        countAndPrintVotes(questions, votes);
    }

    //todo: design method for future votes counter implementation
    public static void voteCounter() {
        int column = 2;
        int row = 30;

        String[][] alternativeVotes = new String[column][row];

        for (int i = 0; i < alternativeVotes.length; i++) {
            for (int k = 0; k < alternativeVotes[i].length; k++) {
                alternativeVotes[i][k] = "yes";
            }
        }
        System.out.println(Arrays.deepToString(alternativeVotes));
    }

    public static void countAndPrintVotes(final String[] questions, final String[][] votes) {
        /*int votesYesCount = 0;
        int votesNoCount = 0;*/
        for (int i = 0; i < votes.length; i++) {
            System.out.println(questions[i]);
            for (int k = 0; k < votes[i].length; k++) {
                // TODO: implement if-else incrementing yes/no counters
                System.out.println(votes[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.deepToString(votes));
    }
}
