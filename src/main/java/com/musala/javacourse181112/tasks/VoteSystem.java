package com.musala.javacourse181112.tasks;

// clean
public class VoteSystem {
    private static final int QUESTIONS_COUNT = 3;
    private static final int VOTES_COUNT = 30;
    public static void main(final String[] args) {
        System.out.println("Welcome to Vote System");
        final String[][] dataArray = new String[QUESTIONS_COUNT][VOTES_COUNT];
        int questionsCount, votesCount;

        for (questionsCount = 0; questionsCount < dataArray.length; questionsCount++) {
            System.out.println("Please Answer to the Question" + (questionsCount + 1));

            for (votesCount = 0; votesCount < VOTES_COUNT; votesCount++) {
                if (votesCount % 2 == 0) { // could be using ternary operator
                    dataArray[questionsCount][votesCount] = "Yes";
                } else {
                    dataArray[questionsCount][votesCount] = "No";
                }
                System.out.println("Person: " + (votesCount + 1) + " Voted for: "
                        + dataArray[questionsCount][votesCount] + " on question: " + (questionsCount + 1));
            }
        }
    }
}
