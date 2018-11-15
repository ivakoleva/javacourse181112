package com.musala.javacourse181112;

public class Poll {
    public static void main(String[] args) {
        int Maxvoters = 30;
        int Maxquestions = 2;
        String[][] voters = new String[Maxvoters][Maxquestions];
        System.out.println("Welcome!!! \nThe first question is: \nDo you like pizza?");
        for (int j = 0; j < Maxquestions; j++) {
            for(int i=0; i<Maxvoters; i++){


                if ((i % 2) == 0) {
                    voters[i][j] = "Yes";
                } else {
                    voters[i][j] = "No";
                }
            }
        }


        System.exit(0);

}}

