package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class VotesApplicationVersion3 {

    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);
        System.out.print("Enter number of participants: ");
        final int n = input.nextInt();
        final Object[][] votes = new Object[n][3];
        final String[] questions = {"Do you like ice-cream", "Do you drink coffee"};
        //String voteFromConsole;
        int yesCount = 0;
        int noCount = 0;
        int choice;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int v = 0; v < votes.length; v++) {
                /*if(!getValidEgn((String) votes[v][0])) {
                    System.out.println("Please type a valid EGN");
                    System.exit(1);
                }*/

                // while validation usage
                /*while((votes[v][0] = getValidEgn(input)) == null) {
                    System.out.println("Non-valid ENG");
                    System.out.println("Retrying...");
                }*/

                do {
                    votes[v][0] = getValidEgn(input);
                    if(votes[v][0] == null) {
                        System.out.println("Non-valid ENG");
                        System.out.println("Retrying...");
                    }
                } while (votes[v][0] == null);

                System.out.println("Enter name");
                votes[v][1] = input.next();


                do{
                System.out.println("Choose your vote: press 1 for YES or press 2 for NO");
                 choice = input.nextInt();
                switch (choice){
                    case 1:
                        votes[v][2] = Vote.YES;
                        break;
                    case 2:
                        votes[v][2] = Vote.NO;
                        break;
                        default:
                            System.out.println("Please enter a valid number");
                            break;
                }}while (choice < 1 || choice > 2 );
                //voteFromConsole = input.next().toUpperCase();
                //votes[v][2] = Vote.valueOf(voteFromConsole);

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

        if (egn != null && egn.length() == 10) {
            return egn;
        }
        return null;
    }

}


