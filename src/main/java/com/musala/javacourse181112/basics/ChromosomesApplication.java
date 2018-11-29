package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class ChromosomesApplication {
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
