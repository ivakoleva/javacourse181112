package com.musala.javacourse181112.tasks.innerexercise;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LocalClass localClassPrint = new LocalClass("Print");

    public static void main(final String[] args) {
        /*
        //test inner class GearBox
        InnerClass mcLaren = new InnerClass(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(false);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        */

        //test local class Button
        class ClickListener implements LocalClass.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void OnClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        localClassPrint.setOnClickListener(new ClickListener());
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
