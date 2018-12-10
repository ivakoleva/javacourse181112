package com.musala.javacourse181112;

public class Votes {

    public static void main(String[] args) {

        String[][] vote = new String[30][30];

        System.out.println("Welcome ");
        String[] questions = {"Do you like ice cream", "Do you drink coffee"};
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            if(i == 0) {


                for (int voter = 0; voter < 30; voter++) {
                    if (voter % 2 == 0) {
                        vote[voter][0] = "No";
                    } else {
                        vote[voter][0] = "Yes";
                    }

                    System.out.println("Voter " + voter + " voted: " + vote[voter][0]);
                }
            }else {
                for (int j = 0; j < 30; j++) {
                    if (j % 2 == 0) {
                        vote[j][0] = "Yes";
                    } else {
                        vote[j][0] = "No";
                    }

                    System.out.println("Voter " + j + " voted: " + vote[j][0]);
                }
            }
            System.out.println();
        }

    }
}
