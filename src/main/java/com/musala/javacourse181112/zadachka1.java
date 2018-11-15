package com.musala.javacourse181112;

import java.awt.*;

/**
 * zadacha:
 * program prameters, supplied by user:
 *      person age in years
 *      years to add to age
 * program flow:
 *      when starting program print two numbers
 *      then ask the numbers and print to standars output
 *      then exit
 * distribute to end user (push to github)
 */
public class zadachka1 {
    public static void main(String[] args) {
        int age =19;
        int yearstoadd=25;
        int newage;
        System.out.println("Age = "+age);
        System.out.println("Added years ="+yearstoadd);
        newage = age + yearstoadd;
        System.out.println("The new age is ="+newage);
        System.exit(0);
    }
}
