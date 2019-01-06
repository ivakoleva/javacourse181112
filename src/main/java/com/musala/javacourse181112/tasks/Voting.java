package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.tasks.votesexercise.Vote;

// OKI * 2
public class Voting {
    public static final int QUESTIONS_COUNT = 2;
    public static final int VOTES_COUNT = 3;
    public static final String QUESTION_PREFIX = "Question ";
    public static final String QUESTION_SEPARATOR = ": ";
    public static final int PEOPLE_NUMBER = 3;
    public static final int PEOPLE_ELEMENTS = 3;

    public static final Vote[][] VOTES = new Vote[QUESTIONS_COUNT][VOTES_COUNT];
    public static Object[][] PERSONS = new Object[PEOPLE_NUMBER][PEOPLE_ELEMENTS];

    public static void main(final String[] args) {
        // populate persons
        PERSONS[0][0] = "9812124505";
        PERSONS[0][1] = "Todor";
        PERSONS[0][2] = Vote.YES;
        PERSONS[1][0] = "9812124505";
        PERSONS[1][1] = "krisa";
        PERSONS[1][2] = Vote.NO;
        PERSONS[2][0] = "9812124505";
        PERSONS[2][1] = "radost";
        PERSONS[2][2] = Vote.YES;


        int qIndex = 0;

        // populate data
        final String q0 = "Do You like snow?";
        for(int i=0;i<VOTES[qIndex].length;i++) {
            VOTES[qIndex][i] = getVoteFromPersonArrayByIndex(i);

        }
        // print data
        printQuestion(qIndex, q0);
        printVotes(qIndex);

        // populate data
        final String q1 = "Do you want it to snow today?";
        for(int i=0;i<VOTES[++qIndex].length;i++) {
            if(i%2==0){
                VOTES[qIndex][i] = Vote.YES;
            }
            else
                VOTES[qIndex][i] = Vote.NO;

        }
        // print data
        printQuestion(qIndex, q1);
        printVotes(qIndex);

        countVotes();
    }

    public static void printQuestion(final int index, final String content) {
        System.out.println(QUESTION_PREFIX + (index + 1) + QUESTION_SEPARATOR + content);
    }

    public static void printVotes(final int questionIndex) {

        for(int i=0;i<VOTES[0].length;i++){
        System.out.println("Vote "+i+": " + VOTES[questionIndex][i]);

        }
    }


    public static void countVotes() {
        int voteYes = 0;
        int voteNo = 0;
        for (int i = 0; i < VOTES.length; i++) {
            for (int j = 0; j < VOTES[i].length; j++) {
                if (VOTES[i][j] == Vote.YES) {
                    voteYes++;
                } else {
                    voteNo++;
                }
            }
            System.out.println("Votes for Question " + (i + 1) + " Yes: " + voteYes + " No: " + voteNo);
            voteNo = 0;
            voteYes = 0;
        }
    }

    private static Vote getVoteFromPersonArrayByIndex(final int index) {
        return (Vote) PERSONS[index][2];
    }
}
