package com.musala.javacourse181112;

import java.util.*;
import java.util.stream.Collectors;

// nice
public class VoteProgram {
    private static final Random RANDOM = new Random();
    private static final int voters = 30;
    public static void main(final String[] args) {

        final Map<Integer, String[]> voting = new HashMap<>();

        // generate 30 votes
        for (int i = 1; i <=5 ; i++) {
            final String[] votes = new String[voters];
            for (int j = 0; j < voters; j++) {
                votes[j] = RANDOM.nextInt(2) + 1 == 1 ? "Yes" : "No"; // expression ? if-true-do-that : else-do-that
            }
            voting.put(i, votes);
        }

        for (Map.Entry<Integer, String[]> entry:voting.entrySet()) {
            System.out.println("Question: " + entry.getKey());
            Arrays.stream(entry.getValue())
                    .collect(Collectors.groupingBy(s -> s))
                    .forEach((k, v) -> System.out.println(k+" "+v.size()));
        }



    }
}
