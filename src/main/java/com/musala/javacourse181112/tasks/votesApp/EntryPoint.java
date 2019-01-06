package com.musala.javacourse181112.tasks.votesApp;

public class EntryPoint {
//        ** Votes v0.4 - introduce OOP concepts
//        *** subpackage, data model
//        *** entry point class, with main method
//        *** etc.

    public static void main(final String[] args) {
        Voter voter1 = new Voter(1);
        Voter voter2 = new Voter(1);

        System.out.println("Name:" + voter1.getRandomName() + " EGN:" +
                voter1.getRandomEGN() + " answered: " + voter1.randomAnswer());
        System.out.println("Name:" + voter2.getRandomName() + " EGN:" +
                voter2.getRandomEGN() + " answered: " + voter2.randomAnswer());
    }
}
