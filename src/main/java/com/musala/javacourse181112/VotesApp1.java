package com.musala.javacourse181112;

//good
public class VotesApp1 {
    public static final int MAX_QUESTIONS = 2;
    // TODO: MAX_VOTES
    public static void main(final String[] args) {
        final String[][] voters = new String[30][30]; // naming, dynamic size, immutability
        System.out.println("Welcome!!! \nThe first question is: \nDo you like pizza?");
        for (int i = 0; i < 30; i++) { // outer/inner for; dynamic size; {} for readability
            if ((i / 2) == 0) { // maybe short notation instead
                voters[i][0] = "Yes";
            } else {
                voters[i][0] = "No";
            }
            System.out.println("Voter " + i + " voted: " + voters[i][0]);
        }

        for (int i = 0; i < 30; i++) {
            if (i / 2 == 0) voters[i][1] = "No";
            else voters[i][1] = "Yes";

        }
        System.exit(0); // this is relevant to the specific run standalone style of IntelliJ only
    }
}
