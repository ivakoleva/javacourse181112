package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class CompositionAndInheritanceExercise {
    public static void main(final String[] args) {
        final Human human1 = new Human();
        // TODO: set alive
        human1.setAlive(true);
        //TODO: final Human human2 = human1.giveBirth();
    }
}

interface Being {
    boolean isAlive();
}

abstract class Mammal implements Being {
    abstract Mammal giveBirth();
}

// TODO: implement
class Human extends Mammal {
    private boolean isAlive;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    Human giveBirth() {
        return new Human();
    }
}
