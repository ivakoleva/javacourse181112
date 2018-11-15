package com.musala.javacourse181112;
import java.util.Random;
import java.util.Arrays;
import java.util.stream.Collectors;
public class VoteProgram {
    public static void main(String[] args) {
        String[] votes = new String[30];
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            int vote = rand.nextInt(2) + 1;
            if (vote == 1) {
                votes[i] = "Yes";
                continue;
            }
            votes[i]="No";
        }
        Arrays.stream(votes)
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) -> System.out.println(k+" "+v.size()));
    }
}
