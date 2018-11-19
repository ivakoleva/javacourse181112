package com.musala.javacourse181112.tasks;

import java.util.Scanner;
public class ChromosomesApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String gender = scan.next();
        switch (gender.toLowerCase()){
            case "male":
                System.out.print("Y");
            case "female":
                if (gender.toLowerCase().equals("female")){
                System.out.print("X");}
            default:
                System.out.print("X");

        }
    }
}
