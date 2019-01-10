package com.musala.javacourse181112.tasks.VotingApp;

public class VoteMain {
    public static void main(String[] args) {

        Voters voter1 = new Voters(1);
        Voters voter2 = new Voters(1);
        Voters voter3 = new Voters(1);

        System.out.println("\nDid you play football ?");
        System.out.println("Name:" + voter1.getVoterName() + "\nEGN: " +
                voter1.getVoterEgn() + "\nanswered: " + voter1.randomAnswer());

        System.out.println("\nDid you like basketball ?");
        System.out.println("Name:" + voter2.getVoterName() + "\nEGN: " +
                voter2.getVoterEgn() + "\nanswered: " + voter2.randomAnswer());

        System.out.println("\nDid you like formula 1 ?");
        System.out.println("Name:" + voter3.getVoterName() + "\nEGN: " +
                voter3.getVoterEgn() + "\nanswered: " + voter3.randomAnswer());
    }
}




