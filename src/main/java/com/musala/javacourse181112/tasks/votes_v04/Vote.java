package com.musala.javacourse181112.tasks.votes_v04;

import java.util.Random;

public class Vote {
    private boolean answer;
    private int questionNum;

    public Vote(int questionNum) {
        this.answer = randomAnswer();
        this.questionNum = questionNum;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    protected boolean randomAnswer() {
        Random randomBooleanAnswer = new Random();
        return randomBooleanAnswer.nextBoolean();
    }
}
