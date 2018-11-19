package com.musala.javacourse181112.tasks;

public class TernaryRunner {
    public static void main(String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if("yes".equals(value)) {
            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        }

        // TODO: 2-lines implementation, using ternary operator


        final int checkYes = "yes".equals(value) ? yesCounter++ : noCounter++;
        final int checkNo = "no".equals(value) ? noCounter++ : yesCounter++;
        System.out.println( yesCounter + "  " + noCounter);
    }
}
