package com.musala.javacourse181112.tasks.votesexercise.model;

import java.util.List;

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