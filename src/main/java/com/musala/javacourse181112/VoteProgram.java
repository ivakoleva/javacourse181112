package com.musala.javacourse181112;

import java.util.Random;
import java.util.Arrays;
import java.util.stream.Collectors;

// nice
public class VoteProgram {
    private static final Random RANDOM = new Random();

    public static void main(final String[] args) {
        final String[] votes = new String[30];

        // generate 30 votes
        for (int i = 0; i < 30; i++) {
            votes[i] = RANDOM.nextInt(2) + 1 == 1 ?
                    "Yes" : "No"; // expression ? if-true-do-that : else-do-that
        }

        Arrays.stream(votes)
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));
    }
}
