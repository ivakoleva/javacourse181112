package com.musala.javacourse181112.tasks;

public class TernaryRunner {
    public static void main(String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if ("yes".equals(value)) {
            yesCounter++;
        } else if ("no".equals(value)) {
            noCounter++;
        }


//        final int checkYes = "yes".equals(value) ? yesCounter++ : noCounter++;
//        final int checkNo = "no".equals(value) ? noCounter++ : yesCounter++;

//        yesCounter = "yes".equals(value) ? yesCounter +1 : yesCounter;
//        noCounter = "no".equals(value) ? noCounter +1 : noCounter;

        yesCounter += "yes".equals(value) ? 1 : 0;
        noCounter += "no".equals(value) ? 1 : 0;

        System.out.println(yesCounter + "  " + noCounter);
    }
}
