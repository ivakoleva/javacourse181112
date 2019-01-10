package com.musala.javacourse181112.tasks.innerexercise;

public class LocalClass {

    public void print() {
        class Hello {
            private void printHello() {
                System.out.println("Hello");
            }
        }
        final Hello hello = new Hello();
        hello.printHello();
    }

}
class Entry {
    public static void main(final String[] args) {
        final LocalClass local = new LocalClass();
        local.print();


    }
}
