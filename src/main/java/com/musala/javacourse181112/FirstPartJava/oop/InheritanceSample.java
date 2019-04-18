package com.musala.javacourse181112.FirstPartJava.oop;


import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class InheritanceSample {
    public static void main(final String[] args) {
        final Human human1 = new Human();
        //human1.setAlive(true);
        final Human human2 = (Human) human1.giveBirth();
        System.out.println(human1);
    }
}

interface Being {
    boolean isAlive();

    void setAlive(boolean alive);
}

abstract class Mammal implements Being {
    private boolean alive;
    private int birthsCount;

    public Mammal() {
        alive = true;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getBirthsCount() {
        return birthsCount;
    }

    protected abstract Mammal generateMammal();

    Mammal giveBirth() {
        birthsCount++;
        return generateMammal();
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "alive=" + alive +
                ", birthsCount=" + birthsCount +
                '}';
    }
}

// TODO: implement
class Human extends Mammal {
    private Closeable closeable = new Closeable() {
        @Override
        public void close() throws IOException {
            // for example
        }
    };

    public Human() {
        super(); // should be on first line
        System.out.println("asd");
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    protected Human generateMammal() {
        return new Human();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception ignored) {
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Human{" +
                "closeable=" + closeable +
                '}';
    }
}
