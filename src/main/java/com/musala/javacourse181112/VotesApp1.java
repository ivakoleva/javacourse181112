package com.musala.javacourse181112;

public class VotesApp1 {

    public static void main(final String[] args) {
        String[][] votes = new String[2][30];

        System.out.println("Welcome to our poll! We are going to ask you 2 questions!");
        System.out.println("Question 1: Is it snowing today?");
        System.out.println(votes[0][0] = "No.");
        System.out.println(votes[0][1] = "Yes.");
        System.out.println(votes[0][2] = "Yes.");

        System.out.println("Question 2: Do you want rather to be snowing today?");
        System.out.println(votes[1][0] = "Yes.");
        System.out.println(votes[1][1] = "No.");
        System.out.println(votes[1][2] = "No.");
        votesCounter(votes);
    }
    public static int votesCounter(String [][] vote){
        return 0;
    }
}
