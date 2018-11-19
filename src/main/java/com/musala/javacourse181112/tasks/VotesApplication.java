package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class VotesApplication {

    public static void main(String[] args) {
        Object[][] vote = new Object[3][3];
        Scanner input = new Scanner(System.in);


        String[] questions = {"Do you like ice cream", "Do you drink coffee"};
        String voteFromConsole ="";
        int yesCount = 0;
        int noCout = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int voter = 0; voter < vote.length; voter++) {

                System.out.println("Enter EGN");
                vote[voter][0] = input.next();

                System.out.println("Enter name");
                vote[voter][1] = input.next();

                System.out.println("Enter vote YES/NO ");
                voteFromConsole = input.next().toUpperCase();
                EnumVote enumVote  = EnumVote.valueOf(voteFromConsole);
                vote[voter][2] = enumVote;

                if(enumVote.equals(EnumVote.YES)){
                    yesCount++;
                }else {
                    noCout++;
                }
            }
            System.out.println(Arrays.deepToString(vote));
            System.out.println();
        }

        System.out.println("Results " + " YES - " + yesCount + " NO - " + noCout);
    }

    //EnumVote voteEnumYes = EnumVote.YES;
    //EnumVote voteEnumNo = EnumVote.NO;
    //Object[][] vote = new String[3][3];

    //array[0][0] = "Ivan";
    // array [0][1] = "92212312";
    //array[0][2] = voteEnumYes;

       /*vote[0][0] = "6854455240";
        vote[0][1] = "Ivan";
        vote[0][2] = voteEnumYes;

        vote [1][0] = "45522142";
        vote[1][1] = "Pehso";
        vote[1][2] = voteEnumNo;

        vote [2][0] = "1000000";
        vote[2][1] = "Gosho";
        vote[2][2] = voteEnumNo;

        System.out.println(Arrays.deepToString(array));*/
}


