package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class CompositionAndInheritanceExercise {
    public static void main(final String[] args) {
        final Human human1 = new Human();
        human1.setAlive(false);
        final Human human2 = (Human) human1.giveBirth();
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
    boolean alive;


    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    Mammal giveBirth() {
        return new Human();
    }
}
