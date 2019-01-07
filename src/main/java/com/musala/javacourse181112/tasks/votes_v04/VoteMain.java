package com.musala.javacourse181112.tasks.votes_v04;

public class VoteMain {
    public static void main(String[] args) {
        Voters voter1 = new Voters(1);
        Voters voter2 = new Voters(2);

        System.out.println("Name:" + voter1.getRandomName() + "\nEGN:" +
                voter1.getRandomEgn() + "\nAnswered: " + voter1.randomAnswer() + "\n");
        System.out.println("Name:" + voter2.getRandomName() + "\nEGN:" +
                voter2.getRandomEgn() + "\nAnswered: " + voter2.randomAnswer() + "\n");
    }
}