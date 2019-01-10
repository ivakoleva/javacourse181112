package com.musala.javacourse181112.tasks.innerexercise;

public class AnonymousClass {
    public static void main(final String[] args) {

        final Displayable displayable = new ImplementDisplayable();
        displayable.display();

        final Displayable anonymousDisplayable = () -> System.out.println("Anonymous");
        anonymousDisplayable.display();
    }
}

interface Displayable {
    void display();
}

class ImplementDisplayable implements Displayable {

    @Override
    public void display() {
        System.out.println("ImplementDisplayable class");
    }
}