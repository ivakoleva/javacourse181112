package com.musala.javacourse181112.tasks.innerexercise;

class Test implements NestedInterface.Displayable {

    @Override
    public void display() {
        System.out.println("Method from nested interface");
    }
}

class ProtectedNestedInterface {

    protected interface Displayable {
        void display();
    }
}

class Example implements ProtectedNestedInterface.Displayable {

    @Override
    public void display() {
        System.out.println("Method from protected nested interface");
    }
}

public class TestNestedInterface {
    public static void main(final String[] args) {
        final Test test = new Test();
        test.display();

        final Example example = new Example();
        example.display();
    }
}