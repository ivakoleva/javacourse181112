package com.musala.javacourse181112.tasks;


public class VotesV01Application {
    public static void main(final String[] args) {

        boolean[][] answer = new boolean[2][30];
        answer[0][0] = false;
        answer[0][1] = false;
        answer[0][2] = true;
        answer[1][0] = true;
        answer[1][1] = false;
        answer[1][2] = true;

        System.out.println("Welcome! Question 1: Is it snowing today? \nPerson 1 answers: " + answer[0][0]);
        System.out.println("Person 2 answers: " + answer[0][1]);
        System.out.println("Person 3 answers: " + answer[0][2]);
        System.out.println("Welcome! Question 2: Do you rather be snowing? \nPerson 1 answers: " + answer[1][0]);
        System.out.println("Person 2 answers: " + answer[1][1]);
        System.out.println("Person 1 answers: " + answer[1][2]);

    }

    public static void voteCounter(int voterNumber, int voteCounter) {

    }

}
