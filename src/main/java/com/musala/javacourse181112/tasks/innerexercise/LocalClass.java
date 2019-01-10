package com.musala.javacourse181112.tasks.innerexercise;

public class LocalClass {
    public static void main(final String[] args) {
        final String myvalue = "Good Bye";


        class NewLocalClass {
            private String myNewValue = "Again good bye";

            public void printValuesToStdout() {
                System.out.println(myNewValue);
            }
        }
        final NewLocalClass localClass = new NewLocalClass();
        localClass.printValuesToStdout();
    }
}