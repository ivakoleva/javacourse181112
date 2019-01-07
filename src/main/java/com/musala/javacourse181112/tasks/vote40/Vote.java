package com.musala.javacourse181112.tasks.vote40;

import java.util.Random;

public class Vote {
    protected boolean answer;
    int questionNumber;

    public Vote(boolean answer, int questionNumber) {
        this.answer = answer;
        this.questionNumber = questionNumber;
    }

    public Vote(int questionNumber) {
        this.answer = randomAnswer();
        this.questionNumber = questionNumber;
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
