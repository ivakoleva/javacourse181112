package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.Collectors;
import com.musala.javacourse181112.enums.Vote;

// nice
public class VoteProgram {
    private static final Random RANDOM = new Random();
    private static final int voters = 30;
    public static void main(final String[] args) {

        final Map<Integer, Vote[]> voting = new HashMap<>();

        // generate 30 votes
        for (int i = 1; i <=5 ; i++) {
            final Vote[] votes = new Vote[voters];
            for (int j = 0; j < voters; j++) {
                int vote = RANDOM.nextInt(3) + 1;
                if (vote == 1)
                    votes[j] = Vote.yes;
                else if (vote == 2)
                    votes[j] = Vote.no;
                else
                    votes[j] = Vote.abstainer;

            }
            voting.put(i, votes);
        }

        for (Map.Entry<Integer, Vote[]> entry:voting.entrySet()) {
            System.out.println("Question: " + entry.getKey());
            Arrays.stream(entry.getValue())
                    .collect(Collectors.groupingBy(s -> s))
                    .forEach((k, v) -> System.out.println(k+" "+v.size()));
        }



    }
}
