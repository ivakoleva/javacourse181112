package com.musala.javacourse181112.tasks.innerexercise;

public class LocalClass {

    public void print() {
        class Hello {
            private static final String HELLO = "Hello";

            private void printHello() {
                System.out.println(HELLO);
            }
        }
        final Hello hello = new Hello();
        hello.printHello();
    }
}

class EntryClass {
    public static void main(final String[] args) {
        final LocalClass localClass = new LocalClass();
        localClass.print();
    }
}


