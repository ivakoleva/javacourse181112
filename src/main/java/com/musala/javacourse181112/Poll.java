package com.musala.javacourse181112;

public class Poll {
    private static final int PEOPLE_COUNT = 3;

    private static void printWelcomeMessage() {
        System.out.println("Welcome!!");

    }

    private static final String[] CHOICE = new String[]{
            "1-Yes",
            "2-No"
    };

    private static final String[] QUESTIONS = new String[]{
            "Is it snowing today? ",
            "Do you want rather to be snowing today?"
    };

    private static void printAnswer(int answer){
        String answer_value = CHOICE[answer-1];
        System.out.println("The answer is: "+answer_value);
    }

    private static void countAnswers(int answers[]) {
        int countYes = 0;
        int countNo = 0;

        for (int person = 0; person < PEOPLE_COUNT; person++) {

            printAnswer(answers[person]);

            if (answers[person] == 1) {
                countYes++;
            } else {
                countNo++;
            }
        }

        System.out.println("Total Yes answers: " + countYes);
        System.out.println("Total No answers: " + countNo);

    }


    public static void main(String[] args) {
        int answer[][] = {{1, 2, 1}, {2, 1, 2}};

        printWelcomeMessage();
        for (int question = 0; question < QUESTIONS.length; question++) {
            System.out.println(QUESTIONS[question]);
            countAnswers(answer[question]);

        }
        System.exit(0);
    }

}