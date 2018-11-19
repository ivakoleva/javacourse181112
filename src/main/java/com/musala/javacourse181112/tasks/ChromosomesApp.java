package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.enums.Gender;

import java.util.Scanner;
public class ChromosomesApp {
    public static void main(String[] args){
        final Scanner scan = new Scanner(System.in);
        final Gender gender;
        gender = scan.next().equalsIgnoreCase("female") ?  Gender.Female :  Gender.Male;
        switch (gender){
            case Female:
                System.out.print("X");
            case Male:
                if (gender.equals(Gender.Male)){
                System.out.print("Y");}
            default:
                System.out.println("X");

        }
        switch (gender){
            case Female:
                System.out.print("X");
            case Male:
                System.out.print("X");
            default:
                if (gender.equals(Gender.Male))
                System.out.print("Y");

        }
    }
}
