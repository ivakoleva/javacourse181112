package com.musala.javacourse181112.tasks.votesApp;

import java.util.Random;

public class Vote {
    private boolean answer;
    private int questionNumber;

    public Vote(int questionNumber) {
        this.setAnswer(randomAnswer());
        this.setQuestionNumber(questionNumber);
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    protected boolean randomAnswer() {
        Random randomBooleanAnswer = new Random();
        return randomBooleanAnswer.nextBoolean();
    }
}
