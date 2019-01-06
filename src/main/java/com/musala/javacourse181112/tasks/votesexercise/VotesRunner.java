package com.musala.javacourse181112.tasks.votesexercise;

import java.util.ArrayList;
import java.util.List;

public class VotesRunner {
    private static final String[] QUESTIONS = {
            "do you like snow?",
            "do you want it to snow today?"
    };
    private static final int PEOPLE = 3;

    public static void main(final String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < PEOPLE; i++) {
            personList.add(new Person("Person" + i));
        }

        VoteUtills.printQuestionsAndCountVotes(QUESTIONS, personList);



    }
}
