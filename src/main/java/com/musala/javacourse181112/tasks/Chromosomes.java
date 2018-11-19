package com.musala.javacourse181112.tasks;

import java.util.Scanner;

// super
public class Chromosomes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String gender = s.next();
        int i = 0;
        switch (gender.toLowerCase()) {
            case "male":
                System.out.print("Y");
                i++;
            case "female":
                if (i > 1) {
                    System.out.print("X");
                    i++;
                }
            default:
                if (i > 0) {
                    System.out.println("X");
                } else {
                    System.out.println("Error");
                }
        }
        /*switch(gender.toLowerCase()){
            case "male":
                System.out.println("YX");
                break;
            case "female":
                    System.out.println("XX");
                    break;
            default:
                System.out.println("Error");
                break;
        }*/
    }
}
