package com.musala.javacourse181112.tasks.VotingApp;

public class Vote {
    private  boolean answer ;
    private int questionNumber;

    public Vote(boolean answer, int questionNumber) {
        this.answer = answer;
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
}
