package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Chromosomes {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String gender;
        System.out.println("Enter gender male or female");
        gender=input.nextLine();
        switch(gender){
            case "male":
                System.out.println("y");
                break;
            case "female":
                System.out.println("The chromosomes for this gender are xx");
                break;
                default:
                    System.out.println("Error");
                    break;


        }



    }
}
