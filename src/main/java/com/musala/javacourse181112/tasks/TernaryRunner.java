package com.musala.javacourse181112.tasks;

public class TernaryRunner {
    public static void main(final String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if ("yes".equals(value)) {
            yesCounter++;
        } else if ("no".equals(value)) {
            noCounter++;
        }

        // TODO: 2-lines implementation, using ternary operator

        yesCounter = "yes".equals(value) ? yesCounter++ : noCounter++;

        System.out.println("Yes: " + yesCounter + "\nNo: " + noCounter);

    }
}
