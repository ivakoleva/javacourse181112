package com.musala.javacourse181112.tasks;

public class Voteapp {
    public static void main(String[] args) {
        System.out.println("Hello! Please answer the questions with Yes/No.");
        String firstQuestion = "Are you happy today?";
        String secondQuestion = "Do you like snow?";
        String answerYes = String.valueOf(Vote.YES);
        String answerNo = String.valueOf(Vote.NO);
        System.out.println("The first question is: " + firstQuestion);
        System.out.println("The second question is: " + secondQuestion);
        String[][] votes = new String[2][30];

        //votes
        votes[0] [0] = answerYes;
        votes[1] [0] = answerNo;
        votes[0] [1] = answerYes;
        votes[1] [1] = answerYes;
        votes[0] [2] = answerNo;
        votes[1] [2] = answerNo;

        for (int i = 0; i<votes.length; i++);







    }
}
