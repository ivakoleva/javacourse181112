package com.musala.javacourse181112.tasks.vote40;

public class MainClass {
    // TODO
    public static void main(final String[] args) {
        Voter voter1 = new Voter(1);
        Voter voter2 = new Voter(1);

        System.out.println("name:" + voter1.getRandomName() + " egn: " +
                voter1.getRandomEGN() + " answered: " + voter1.randomAnswer());
        System.out.println("name:" + voter2.getRandomName() + " egn: " +
                voter2.getRandomEGN() + " answered: " + voter2.randomAnswer());
    }
}
