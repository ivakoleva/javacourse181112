package com.musala.javacourse181112.tasks.votesystem;
// Version V2
// clean
public class VoteSystem {
    private static final int QUESTIONS_COUNT = 3;
    private static final int VOTES_COUNT = 30;

    public enum AnswerEnum {
        Yes,
        No
    }

    public static void main(final String[] args) {
        int answerYesCounter = 0;
        int answerNoCounter = 0;
        System.out.println("Welcome to Vote System");
        final String[][] dataArray = new String[QUESTIONS_COUNT][VOTES_COUNT];
        int i, j;

        for (i = 0; i < dataArray.length; i++) {
            System.out.println("Please Answer to the Question" + (i + 1));

            for (j = 0; j < VOTES_COUNT; j++) {
                if (j % 2 == 0) { // could be using ternary operator
                    dataArray[i][j] = AnswerEnum.Yes.toString();
                    answerYesCounter++;
                } else {
                    dataArray[i][j] = AnswerEnum.No.toString();
                    answerNoCounter++;
                }
                /*dataArray[i][j]= (j % 2 == 0)?
                        AnswerEnum.Yes.toString():
                        AnswerEnum.No.toString();*/
                System.out.println("Person: " + (j + 1) + " Voted for: "
                        + dataArray[i][j] + " on question: " + (i + 1));
            }
        }
        System.out.println("Total "+ AnswerEnum.Yes.toString() +" votes: " + answerYesCounter
                        + " Total "+ AnswerEnum.No.toString() +"votes: " + answerNoCounter);
    }
}
