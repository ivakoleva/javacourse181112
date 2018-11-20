package com.musala.javacourse181112.VoteApp;

import java.time.Instant;
import java.util.*;

import com.musala.javacourse181112.VoteApp.Models.Person;
import com.musala.javacourse181112.VoteApp.Models.Poll;
import com.musala.javacourse181112.enums.FirstName;
import com.musala.javacourse181112.enums.LastName;
import com.musala.javacourse181112.enums.Vote;
import java.util.Scanner;

// nice
public class VoteProgram {
    private static final Random RANDOM = new Random();
    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {

        final int voteGivers;
        final int pollsCount;

        System.out.print("Enter how many people will vote: ");
        voteGivers = scan.nextInt();
        System.out.print("Enter how many polls will there: ");
        pollsCount = scan.nextInt();

        Person voters[] = new Person[voteGivers];
        voters = createVoters(voters);
        Poll polls[] = new Poll[pollsCount];
        polls = createPolls(polls, voteGivers);

        printResult(vote(voters, polls));
    }

    private static Poll[] createPolls(Poll[] polls, int voteGivers) {
        for (int i = 0; i < polls.length; i++) {
            System.out.print("Enter question: ");
            String question = scan.nextLine();
            Date startDate = Date.from(Instant.now());
            polls[i] = new Poll(question, startDate, voteGivers);
        }
        return polls;
    }

    private static Person[] createVoters(Person[] voters) {
        for (int i = 0; i < voters.length; i++) {
            String firstName = FirstName.values()[RANDOM.nextInt(4) + 1].toString();
            String lastName = LastName.values()[RANDOM.nextInt(4) + 1].toString();
            int age = RANDOM.nextInt(18) + 110;
            voters[i] = new Person(firstName, lastName, age);
        }
        return voters;
    }

    private static void printResult(Poll[] result) {
        for (Poll poll : result) {
            System.out.printf("%s%nDate: %s%n",poll.getQuestion(), poll.getDate());
            for (Person voter : poll.getVoters()) {
                System.out.printf("%n--First name: %s%n--Last name: %s%n--Age: %d%n--Vote: %s%n", voter.getFirstName(), voter.getLastName(), voter.getAge(), voter.getVote());
            }
        }
    }

    private static Poll[] vote(Person[] voters, Poll[] polls) {
        for (int i = 0; i < polls.length ; i++) {
            for (int j = 0; j < voters.length; j++) {
                int vote = RANDOM.nextInt(3) + 1;
                if (vote == 1) {
                    voters[j].vote(Vote.Yes);
                    Person per = voters[j];
                    polls[i].getVoters()[j] = (per);
                }
                else if (vote == 2) {
                    voters[j].vote(Vote.Yes);
                    Person per = voters[j];
                    polls[i].getVoters()[j] = (per);

                }
                else {
                    voters[j].vote(Vote.Yes);
                    Person per = voters[j];
                    polls[i].getVoters()[j] = (per);

                }
            }
        }
        return polls;
    }
}
