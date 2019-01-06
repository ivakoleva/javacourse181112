package com.musala.javacourse181112.tasks.vote40;

public class mainFunction {
    public static void main(final String[] args) {
        Voter voter1 = new Voter(1);
        Voter voter2 = new Voter(1);

        System.out.println("Name:" + voter1.getRandomName() + " EGN: " +
                voter1.getRandomEGN() + " answered: " + voter1.randomAnswer());
        System.out.println("Name:" + voter2.getRandomName() + " EGN: " +
                voter2.getRandomEGN() + " answered: " + voter2.randomAnswer());
    }
}
