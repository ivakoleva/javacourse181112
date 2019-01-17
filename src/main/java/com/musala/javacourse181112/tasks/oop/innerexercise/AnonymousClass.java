package com.musala.javacourse181112.tasks.oop.innerexercise;

import java.util.Scanner;

/*
        define and instantiate one instance per each listed bellow;
        narrow scope of visibility outside outer context
        (minimum visibility using access modifiers)
        *** Anonymous class (using a functional interface)
        * Anonymous class is a nessted class without a class name
        * public class AnonymousClassSample {
 */
public class AnonymousClass {
    //    public static void main(final String[] args) {
//        final FunctionalInterface myFunctionalInterface = new FunctionalInterface() {
//
//            @Override
//            public Class<? extends Annotation> annotationType() {
//                return null;
//            }
//        }
//    }
    private static Scanner scanner = new Scanner(System.in);
    private static LocalClass localClassPrint = new LocalClass("Print");

    public static void main(String[] args) {
        localClassPrint.setOnClickListener(new LocalClass.OnClickListener() {
            @Override
            public void OnClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    localClassPrint.onClick();
            }
        }
    }
}


