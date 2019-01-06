package com.musala.javacourse181112.tasks.votes_v04;

public class Vote {
private boolean answer;
private int question;

    public Vote(boolean answer, int question) {
        this.answer = answer;
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }
}
