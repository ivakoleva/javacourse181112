package com.musala.javacourse181112.tasks.votesApp;

public class Application {
//        ** Votes v0.4 - introduce OOP concepts
//        *** subpackage, data model
//        *** entry point class, with main method
//        *** etc.

    public static void main(final String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(1);

        System.out.println("Name:" + person1.getRandomName() + " EGN:" +
                person1.getRandomEGN() + " answered: " + person1.randomAnswer());
        System.out.println("Name:" + person2.getRandomName() + " EGN:" +
                person2.getRandomEGN() + " answered: " + person2.randomAnswer());
    }
}
