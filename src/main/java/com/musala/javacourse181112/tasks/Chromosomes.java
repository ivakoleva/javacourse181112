package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {
    private static final Scanner CONSOLE= new Scanner(System.in);
    private static void chromosomeForGender(Scanner CONSOLE){
        System.out.println("Chose gender :");
        switch(CONSOLE.next()) {
            case"female":
                System.out.println("The Female chromosome is:XX ");
                break;
            case "male":
                System.out.println("The Male chromosome is:XY ");
        }
    }
public static void main(String[]args) {


    chromosomeForGender(CONSOLE);
 }
}
