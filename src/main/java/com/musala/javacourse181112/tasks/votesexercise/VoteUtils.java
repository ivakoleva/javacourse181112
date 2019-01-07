package com.musala.javacourse181112.tasks.votesexercise;

import java.util.List;
import java.util.Scanner;


final class VoteUtils {
    private VoteUtils() {
    }

    private static final String QUESTION_PREFIX = "Question:";
    private static final String VOTE_ASKER = "Vote Yes or No";
    private static final String VOTE_COUNT_YES_PREFIX = "The number of people who voted YES is: ";
    private static final String VOTE_COUNT_NO_PREFIX = "The number of people who voted NO is: ";
    static private final Scanner input = new Scanner(System.in);


    static void printQuestionsAndCountVotes(String[] questions, List<Person> personList) {
        int i = 0;
        int yesCount = 0;
        int noCount = 0;
        for (String question : questions) {
            i++;
            for (Person person : personList) {

                System.out.println(QUESTION_PREFIX + i + " " + person.getName() + " " + question);
                System.out.println(VOTE_ASKER);
                if (input.nextLine().equalsIgnoreCase("yes")) {
                    person.setVote(Vote.YES);
                    yesCount++;
                } else {
                    person.setVote(Vote.NO);
                    noCount++;
                }
            }
            System.out.println(QUESTION_PREFIX + i +
                    System.lineSeparator() + VOTE_COUNT_YES_PREFIX + yesCount +
                    System.lineSeparator() + VOTE_COUNT_NO_PREFIX + noCount +
                    System.lineSeparator());
            yesCount = 0;
            noCount = 0;

        }

    }
}
