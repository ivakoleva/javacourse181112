package com.musala.javacourse181112.methods.votespackage;

import com.musala.javacourse181112.votePackage.Votes;

import java.util.Random;

public class Generator implements Votable {
    private final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    protected String generateName(){
        StringBuilder stringBuilder = new StringBuilder(); // OutOfMemoryError: Java heap space
        Random random = new Random();
        int length = random.nextInt();

        int charInt = random.nextInt(LETTERS.length());
        for (int i = 0; i < length; i++){
            stringBuilder.append(LETTERS.charAt(charInt)); /* I guess the problems stems from the use of random
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

        for (String question : Application.questions) {
            System.out.println(question);

            for (String value : Application.votes) {
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
