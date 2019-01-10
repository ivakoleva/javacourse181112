package com.musala.javacourse181112.tasks.innerexercise;

public class AnonymousClassExercise {
    public static void main(String[] args) {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousClass without lambda");
            }
        };
        runnable.run();
        final Runnable runnable1 = () ->
                System.out.println("AnonymousClas with lambda");
        runnable1.run();
    }
}
