package com.musala.javacourse181112.votePackage;

import java.util.Arrays;
import java.util.Scanner;

public class VotesApplication {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter egn: ");
        person.setEGN(sc.nextLine());
        System.out.println("Enter name: ");
        person.setName(sc.nextLine());

        final String[] questions = {
                "Do you follow the news?",
                "Do you think that Valeri Simeonov should resign?"
        };
        final String[][] votes = {
                {"yes", "no", "yes"},
                {"yes", "yes", "no"}
        };
        System.out.println(Arrays.deepToString(questions) + Arrays.deepToString(votes));

        //voteCounter(); //- not finished
        countAndPrintVotes(questions, votes);
    }

    //todo: design method for future votes counter implementation
    public static void voteCounter() {
        int column = 2;
        int row = 30;

        String[][] alternativeVotes = new String[column][row];

        for (int i = 0; i < alternativeVotes.length; i++) {
            for (int k = 0; k < alternativeVotes[i].length; k++) {
                alternativeVotes[i][k] = "yes";
            }
        }
        System.out.println(Arrays.deepToString(alternativeVotes));
    }

    public static void countAndPrintVotes(final String[] questions, String[][] votes) {
        int votesYesCount = 0;
        int votesNoCount = 0;
        /*for (int i = 0; i < votes.length; i++) {
            System.out.println(questions[i]);
            for (int k = 0; k < votes[i].length; k++) {*/
               // introduce person multi-dimensional array (object), then populate:
                // - first element of each inner person array - egn
                // - second element - name
                // third Vote (enum)
        for (int i = 0; i < votes.length; i++) {
            System.out.println(questions[i]);
            for (int k = 0; k < votes[i].length; k++) {
                if (votes[i][k].equalsIgnoreCase(Votes.YES.name())) {
                    votesYesCount++;
                } else if (votes[i][k].equalsIgnoreCase(Votes.NO.name())) {
                    votesNoCount++;
                }else {
                    // TODO: handle
                    throw new IllegalArgumentException("Vote is invalid");
                }


                /*old implementation:
                if ("yes".equals(votes[i][k])) {
                votesYesCount++;
                }
                else if ("no".equals(votes[i][k])) {
                    votesNoCount++;
                } */

                System.out.println(votes);
            }
        }

            //}
            System.out.println();
            System.out.println("Result:");
            System.out.println("Yes: " + votesYesCount);
            System.out.println("No: " + votesNoCount);
            System.out.println();
        //}
        System.out.println();
        System.out.println(Arrays.deepToString(votes));

    }
}
