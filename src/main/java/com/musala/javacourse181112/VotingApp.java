package com.musala.javacourse181112;

public class VotingApp {
    public static void main(String[] args) {

        // welcome message
        System.out.println("Please vote now ,answer the following questions ");

        // 2 questions,30 voters
        final String[][] votersArr = new String[2][30];

        // hardcode 3 person votes (voted yes/no) for the 2 questions
        String person1 = "Yes";
        String person2 = "No";
        String person3 = "No";
        String person4 = "No";
        String person5 = "Yes";
        String person6 = "Yes";

        //assign votes to array
        votersArr[0][0] = person1;
        votersArr[0][1] = person2;
        votersArr[0][2] = person3;
        votersArr[1][0] = person4;
        votersArr[1][1] = person5;
        votersArr[1][2] = person6;

        //question 1
        System.out.println("Did you like football ?  ");

        for (int i = 0; i < votersArr.length + 1; i++) {
            System.out.println(" " + votersArr[0][i]);
        }
        //question 2
        System.out.println("Did you play football ? ");

        for (int i = 0; i < votersArr.length + 1; i++) {
            System.out.println(" " + votersArr[1][i]);
        }
    }
}



