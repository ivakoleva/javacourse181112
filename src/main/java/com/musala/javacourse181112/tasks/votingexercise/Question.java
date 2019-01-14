package com.musala.javacourse181112.tasks.votingexercise;

import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Question {
    private String name;
    private List<Answer> answerAvailableList;
    // private List<AnswerGiven> answerGivenList;
    //private List<Person> personVotedList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswerList() {
        return answerAvailableList;
    }

    public void setAnswerList(List<Answer> answerAvailableList) {
        this.answerAvailableList = answerAvailableList;
    }


}
