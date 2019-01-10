package com.musala.javacourse181112.tasks.votesexercise;

import java.util.Random;
import java.util.Scanner;

public class VoteUtills

{
    static void votGen(Person person) {
        String voteQ1, voteQ2;
        while (true) {
            System.out.println("Do you like cats?");

            voteQ1 = VoteRunner.SCN.nextLine();
            if (voteQ1.equalsIgnoreCase("no")) {
                person.setVoteQuestion1(Vote.no);
                VoteRunner.voteNo++;
                break;
            }else{
                if(voteQ1.equalsIgnoreCase("yes")) {
                    person.setVoteQuestion1(Vote.yes);
                    VoteRunner.voteYes++;
                    break;
                }
            }
            System.out.println("You have entered an invalid vote!");

        }
        while (true) {
            System.out.println("Is purple your favourite color?");
            voteQ2 = VoteRunner.SCN.nextLine();
            if(voteQ2.equalsIgnoreCase("no")) {
                person.setVoteQuestion2(Vote.no);
                VoteRunner.voteNo++;
                break;
            }else{
                if (voteQ2.equalsIgnoreCase("yes")) {
                    person.setVoteQuestion2(Vote.yes);
                    VoteRunner.voteYes++;
                    break;
                }
            }
            System.out.println("You have entered an invalid vote!");

        }
    }

    static String firstNameFun(Random generator) throws InterruptedException {
        char firstName[] = new char[VoteRunner.MAX_NAME_LENGHT];
        int nameLen;
        int letter;

        nameLen = generator.nextInt(VoteRunner.MAX_NAME_LENGHT)+1;

        for (int i = 0; i < nameLen; i++) {
            letter = (generator.nextInt(26))+97;
            firstName[i] =(char) letter;
        }
        return new String(firstName);
    }

    static String lastNameFun(Random generator) throws InterruptedException {
        char lastName[] = new char[VoteRunner.MAX_NAME_LENGHT];
        int nameLen;
        int letter;

        nameLen = generator.nextInt(VoteRunner.MAX_NAME_LENGHT)+1;

        Thread.sleep(1000);
        for (int i = 0; i < nameLen; i++) {
            letter = (generator.nextInt(26))+97;
            lastName[i] =(char) letter;
        }
        return new String(lastName);
    }

    static int[] idNum(Random generator) {
        int[] id = new int[VoteRunner.MAX_NAME_LENGHT];

        for (int i = 0; i < VoteRunner.MAX_NAME_LENGHT; i++) {
            id[i] = generator.nextInt(9);
        }
        return id;
    }
}
