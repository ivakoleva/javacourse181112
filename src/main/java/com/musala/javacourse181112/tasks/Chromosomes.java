package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {
    private static final Scanner SCANNER = new Scanner(System.in); // could be a local variable

    private static void chromosomeForGender() {
        System.out.println("Chose gender :");
        switch (SCANNER.next()) {
            case "female":
                System.out.println("The Female chromosome is:XX ");
                break;
            case "male":
                System.out.println("The Male chromosome is:XY ");
        }
    }

    public static void main(final String[] args) {
        chromosomeForGender();
    }
}
