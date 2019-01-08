package com.musala.javacourse181112.oop.votesexercise.model;

import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Question {
    private String name;
    private List<Answer> answerAvailableList;
    private List<AnswerGiven> answerGivenList;
    private List<Person> personVotedList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswerAvailableList() {
        return answerAvailableList;
    }

    public void setAnswerAvailableList(List<Answer> answerAvailableList) {
        this.answerAvailableList = answerAvailableList;
    }

    public List<AnswerGiven> getAnswerGivenList() {
        return answerGivenList;
    }

    public void setAnswerGivenList(List<AnswerGiven> answerGivenList) {
        this.answerGivenList = answerGivenList;
    }

    public List<Person> getPersonVotedList() {
        return personVotedList;
    }

    public void setPersonVotedList(List<Person> personVotedList) {
        this.personVotedList = personVotedList;
    }
}
