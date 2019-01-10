package com.musala.javacourse181112.tasks.innerexercise;

public class LocalClass {
    public static void main(String[] args) {
        final String value = "This is a localClass";

        class LocalClassExercise {
            private String value = "This is LocalClassExercise nested inside Local Class.";

            public void printValue() {
                System.out.println(value);
            }
        }
        final LocalClassExercise localClass = new LocalClassExercise();
        localClass.printValue();
    }
}
