package com.musala.javacourse181112.test1;

import java.util.Scanner;

/**
 * Created by Iva Koleva on 04.02.2019
 * <p>
 * Create the class Robot. Do not use the public access modifier in your class declaration.
 */
class Robot {
    private int currentX;
    private int currentY;
    private int previousX;
    private int previousY;

    public Robot() {
        this(0, 5);
    }

    public Robot(final int x, final int y) {
        move(x, y);
    }

    public void printCurrentCoordinates() {
        System.out.println(currentX + " " + currentY);
    }

    public void printLastCoordinates() {
        System.out.println(previousX + " " + previousY);
    }

    public void printLastMove() {
        if (currentX == previousX) {
            System.out.println("y " + (currentY - previousY));
        } else if (currentY == previousY) {
            System.out.println("x " + (currentX - previousX));
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void moveX(final int dx) {
        move(currentX + dx, currentY);
    }

    public void moveY(final int dy) {
        move(currentX, currentY + dy);
    }

    private void move(final int x, final int y) {
        previousX = currentX;
        previousY = currentY;
        currentX = x;
        currentY = y;
    }
}

// auto-generated
public class RobotMoves {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        int dx = scan.nextInt();
        int dy = scan.nextInt();

        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();

        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();
            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }
    }
}
