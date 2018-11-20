package com.musala.javacourse181112.tasks;

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

        // TODO: use loops
        int qIndex = 0;
        int pIndex = 0;
        // populate data
        final String q0 = "Do You like snow?";
        VOTES[qIndex][0] = getVoteFromPersonArrayByIndex(pIndex);
        VOTES[qIndex][1] = getVoteFromPersonArrayByIndex(++pIndex);
        VOTES[qIndex][2] = getVoteFromPersonArrayByIndex(++pIndex);

        // print data
        printQuestion(qIndex, q0);
        printVotes(qIndex);

        // populate data
        final String q1 = "Do you want it to snow today?";
        VOTES[++qIndex][0] = Vote.YES;
        VOTES[qIndex][1] = Vote.NO;
        VOTES[qIndex][2] = Vote.YES;

        // print data
        printQuestion(qIndex, q1);
        printVotes(qIndex);

        countVotes();
    }

    public static void printQuestion(final int index, final String content) {
        System.out.println(QUESTION_PREFIX + (index + 1) + QUESTION_SEPARATOR + content);
    }

    public static void printVotes(final int questionIndex) {
        // TODO: use loops
        System.out.println("Vote 1: " + VOTES[questionIndex][0]);
        System.out.println("Vote 2: " + VOTES[questionIndex][1]);
        System.out.println("Vote 3: " + VOTES[questionIndex][2]);
    }

    // TODO: implement
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
