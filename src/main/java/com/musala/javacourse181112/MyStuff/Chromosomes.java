package com.musala.javacourse181112.MyStuff;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

    /* create an application that:
    - based on human gender, prints chromosomes ( male xy and female xx)
    - uses switch based check
    - parameters supplied by user
    - accepts program arguments
    - prints chromosomes to stdout

    public static void main(String[] args) {
        String gender;
        System.out.println("What gender are you? Type in male or female");
        final String gender = args[0];
        String chromosomesString = "";
        switch (gender.toLowerCase()){
            case "female":
                chromosomesString +="x";
            case "male":
                chromosomesString +="y";
        }

        /*Scanner scanf = new Scanner(System.in);
        gender = scanf.nextLine();
        if (gender == "male")
            System.out.println("Your Sex Chromosomes are : XY");
        else
            if (gender == "female")
                System.out.println("Your Sex Chromosomes are : XX");


       switch(gender.toLowerCase()) {

           case "male":
               System.out.println("Your Sex Chromosomes are : XY");
           case "female":
               if(gender == "male");
                   else
                   System.out.println("Your Sex Chromosomes are : XX");
           default:
               if (gender != "male" && gender != "female")
               System.out.println("You have made a mistake :( ");
*/
    public class Chromosomes {
        public static void main(final String[] args) {
            final String gender = args[0];

            String chromosomesString = "";
            // to print yx instead, flip gender's order
            switch (gender.toLowerCase()) {
                case "female":
                    chromosomesString += "x";
                case "male":
                    chromosomesString += "x";
                    if(chromosomesString.length() == 2) {
                        break;
                    }
                default:
                    chromosomesString += "y";
            }

            System.out.println("Chromosomes for gender: " + gender);
            System.out.println(chromosomesString);
        }
    }

