package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class VotesApplication {

    public static void main(final String[] args) {
        final Object[][] votes = new Object[3][3];
        final Scanner input = new Scanner(System.in);

        final String[] questions = {"Do you like ice cream", "Do you drink coffee"};
        String voteFromConsole;
        int yesCount = 0;
        int noCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int v = 0; v < votes.length; v++) {
                // while validation usage
                while((votes[v][0] = getValidEgn(input)) == null) {
                    System.out.println("Non-valid ENG");
                    System.out.println("Retrying...");
                }

                /*if(!getValidEgn((String) votes[v][0])) {
                    System.out.println("Please type a valid EGN");
                    System.exit(1);
                }*/

                System.out.println("Enter name");
                votes[v][1] = input.next();

                System.out.println("Enter vote YES/NO");
                voteFromConsole = input.next().toUpperCase();
                votes[v][2] = Vote.valueOf(voteFromConsole);

                if (Vote.YES.equals(votes[v][2])) {
                    yesCount++;
                } else {
                    noCount++;
                }
            }
            System.out.println(Arrays.deepToString(votes));
            System.out.println();
        }

        System.out.println("Results " + " YES - " + yesCount + " NO - " + noCount);
    }

    private static String getValidEgn(final Scanner scanner) {
        System.out.println("Enter EGN");
        final String egn = scanner.next();

        if(egn != null && egn.length() == 10) {
            return egn;
        }
        return null;
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


