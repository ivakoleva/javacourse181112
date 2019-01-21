package com.musala.javacourse181112.methods.votespackage;

import com.musala.javacourse181112.votePackage.Votes;

import java.util.Random;

public class NameGenerator implements Votable {
    private static final Random RANDOM = new Random();
    private final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    String generate() {
        final StringBuilder stringBuilder = new StringBuilder();
        // would suggest some bounds for a feasible name length
        final int length = RANDOM.nextInt(10);
        for (int i = 0; i < length; i++) {
            stringBuilder.append(
                    LETTERS.charAt(
                            RANDOM.nextInt(LETTERS.length()))); /* I guess the problems stems from the use of RANDOM
                                                        and it generates a bigger number than my string length (the charset)
                                                        still not comfortable using breakpoint, tho */
        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    @Override
    public String getValue() {
        int votesYesCount = 0;
        int votesNoCount = 0;

        for (String question : Application.QUESTIONS) {
            System.out.println(question);

            for (String value : Application.VOTES) {
                if (value.equalsIgnoreCase(Votes.YES.name())) {
                    votesYesCount++;
                } else if (value.equalsIgnoreCase(Votes.NO.name())) {
                    votesNoCount++;
                } else {
                    throw new IllegalArgumentException("Vote is invalid");
                }
                System.out.println(value);

            }
        }
        System.out.println("Result:");
        System.out.println("Yes: " + votesYesCount);
        System.out.println("No: " + votesNoCount);
        return null;
    }
}
