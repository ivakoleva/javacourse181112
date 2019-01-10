package com.musala.javacourse181112.tasks.votesystem.votes_v0_6_exercise.model;

import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Question {
    private String name;
    private List<Answer> answerList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
