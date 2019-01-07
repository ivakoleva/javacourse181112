package com.musala.javacourse181112.tasks.votesexercise;

import java.util.ArrayList;
import java.util.List;

public class VotesRunner {
    private static final String[] QUESTIONS = {
            "do you like snow?",
            "do you want it to snow today?"
    };
    private static final int PEOPLE = 3;

    // TODO: data model abstraction (Poll, Question, Answer elaborated)
    public static void main(final String[] args) {
        final List<Person> personList = new ArrayList<>();
        for (int i = 0; i < PEOPLE; i++) {
            final Person person = new Person();
            person.setName("Person" + i);
            personList.add(person);
        }
        VoteUtils.printQuestionsAndCountVotes(QUESTIONS, personList);
    }
}
