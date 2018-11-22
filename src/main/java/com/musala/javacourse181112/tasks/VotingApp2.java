package com.musala.javacourse181112.tasks;

public class VotingApp2 {
    public static void main(String[] args) {

        // welcome message
        System.out.println("Please vote now ,answer the following questions ");

        // 2 questions,3 voters
        final Vote[][] votersArr = new Vote[2][30];

        // hardcode  person votes (voted yes/no) for the 2 questions
        Vote votersAnswer1 = Vote.YES;
        Vote votersAnswer2 = Vote.NO;


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
            System.out.println(" " + votersArr[0][i]);
        }
        //question 2
        System.out.println("Did you play football ? ");

        for (int i = 0; i <= votersArr.length ; i++) {
            System.out.println(" " + votersArr[1][i]);
        }
         //implement votes counting
        int countNo= 0;
        int countYes = 0;

        for (int i=0; i <= votersArr.length ; i++ ){
            if (votersArr[0][i]==Vote.YES){
                countYes++;
            }else {
                countNo++;

            }
        }
        //print count of Yes or No answers
        System.out.println("The Yes answers for first question  are : " + countYes++);
        System.out.println("The No answers are for second question are: " + countNo++);
    }
}



