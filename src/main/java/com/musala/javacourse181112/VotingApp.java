package com.musala.javacourse181112;

public class VotingApp {
    public static void main(String[] args) {

        // welcome message
        System.out.println("Please vote now ,answer the following questions ");

        // 2 questions,3 voters
        final String[][] votersArr = new String[2][3];

        // hardcode  person votes (voted yes/no) for the 2 questions
        String votersAnswer1 = "Yes";
        String votersAnswer2 = "No";


        //assign votes to array
        votersArr[0][0] = votersAnswer1;
        votersArr[0][1] = votersAnswer2;
        votersArr[0][2] = votersAnswer1;
        votersArr[1][0] = votersAnswer2;
        votersArr[1][1] = votersAnswer2;
        votersArr[1][2] = votersAnswer1;

        //question 1
        System.out.println("Did you like football ?  ");

        for (int i = 0; i <= votersArr.length ; i++) {
            System.out.println(i+" " + votersArr[0][i]);
        }
        //question 2
        System.out.println("Did you play football ? ");

        for (int i = 0; i <= votersArr.length ; i++) {
            System.out.println(" " + votersArr[1][i]);
        }
    }
}



