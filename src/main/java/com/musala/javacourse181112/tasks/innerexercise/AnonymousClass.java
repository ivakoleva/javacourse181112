package com.musala.javacourse181112.tasks.innerexercise;

public class AnonymousClass  {
    public static void main(String[] args) {
        final Runnable anonymousRunnable = () -> System.out.println("This is an anonymous cat.");
        anonymousRunnable.run();
    }
}
