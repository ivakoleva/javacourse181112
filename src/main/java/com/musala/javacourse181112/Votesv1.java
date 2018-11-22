package com.musala.javacourse181112;

/*
votes v0.1 application - yes/no pole (all data hardcoded)
 supports
    yes no poll
    max;30 voters per question
    2 questions (data structure?)
 flow- per each question
    print welcome message, stating a poll question
    hardcode 3 person votes (voted yes or no)
    assign votes to array
    todo: design method for future votes counter implementation
hint - multi-dimensional array (array = massive)
distribution to end user (push to github)
sample data:
    question 1: is it snowing today? Yes/No
    question 2: Would you like it to snow today? Yes/No
    3 votes per each question
 */
public class Votesv1 {
    public static void main(String[] args) {
        String[][] votes = new String[2][30];
        System.out.println("Welcome people to my poll!\n Lets get to business: " +
                "\n 1. Do you like cats? yes/no\n" +
                "2. Do you like memes? yes/no");
        votes[0][0] = "yes";
        votes[0][1] = "yes";
        votes[0][2] = "no";
        votes[1][0] = "no";
        votes[1][1] = "yes";
        votes[1][2] = "no";
        System.out.println("For Question 1: \n 2 people voted 'yes' and 1 person 'no',\n" +
                "For Question 2; \n 1 person voted'yes and 2 people voted'no' ");
    }
    public static void countVotes (String[][] votes){  // public static type name ( formalni parametri)
        System.exit (0); // spira programata
    }
}
