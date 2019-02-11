package com.musala.javacourse181112.tasks.VoteApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VotesApp2 {
    public static final int QUESTIONS_COUNT = 2;
    public static final int VOTES_COUNT = 30;
    public static final int PEOPLE_COUNT = 3;
    public static final int PEOPLE_PROPERTIES_COUNT = 3;
    public static final String QUESTION_PREFIX = "Question ";
    public static final String QUESTION_SEPARATOR = ": ";
    public static final String YES = "yes";
    public static final String NO = "no";

    public static void main(final String[] args) {
        final Vote[][] votes = new Vote [QUESTIONS_COUNT][VOTES_COUNT];
        final String[] questions = new String[QUESTIONS_COUNT];
        final Object[][] people = new String[PEOPLE_COUNT][PEOPLE_PROPERTIES_COUNT];

        questions[0] = "Do You like snow?";
        questions[1] = "Do you want it to snow today?";

        int qIndex;

        List<Vote> voteChoises = new ArrayList<>();
        voteChoises.add(Vote.YES);
        voteChoises.add(Vote.NO);

        //for(qIndex = 0; qIndex < QUESTIONS_COUNT; qIndex++) {
        for (qIndex = 0; qIndex < 2; ++qIndex) {
            //populate data
           /* votes[qIndex][0] = Vote.YES;
            votes[qIndex][1] = Vote.NO;
            votes[qIndex][2] = Vote.YES;*/

            for (int voteIndex = 0; voteIndex < 30; ++qIndex) {
                votes[qIndex][voteIndex] = voteChoises.get(new Random().nextInt(voteChoises.size()));
            }

            // print data
            printQuestion(qIndex, questions[qIndex]);
            printVotes(votes, qIndex);
        }

        countVotes(votes);
        //should add 30 more DB
        people[0][0] = "9010234590";
        people[0][1] = "Penka";
        people[0][2] = Vote.YES;

        people[1][0] = "6605127856";
        people[1][1] = "Toni";
        people[1][2] = Vote.NO;

        people[2][0] = "9912315625";
        people[2][1] = "Kiro";
        people[2][2] = Vote.NO;
    }

    public static void printQuestion(final int index, final String content) {
        System.out.println(QUESTION_PREFIX + (index + 1) + QUESTION_SEPARATOR + content);
    }

    public static void printVotes(final Vote[][] votes, final int questionIndex) {
            for(int qIndex = 0; qIndex < VOTES_COUNT; qIndex++) {
            if (votes [questionIndex][qIndex] != null){
            System.out.println("Vote " + qIndex + ": " + votes[questionIndex][qIndex]);
            }
        }
    }

    // TODO: implement
    public static void countVotes(final Vote[][] votes) {
        int yesCount, noCount;

        for (int qIndex = 0; qIndex < QUESTIONS_COUNT; qIndex++ ) {
            yesCount = 0;
            noCount = 0;
            System.out.println("\nQuestion number " + (qIndex + 1) + " results:\n");

            for (int voteIndex = 0; voteIndex < VOTES_COUNT; voteIndex++) {
                if (votes[qIndex][voteIndex] == Vote.YES) {
                    yesCount++;
                }
                else if (votes[qIndex][voteIndex] == Vote.NO) {
                    noCount++;
                }
            }
            System.out.println("Number of YES votes: " + yesCount  );
            System.out.println("Number of NO votes: " + noCount );
        }
    }

}