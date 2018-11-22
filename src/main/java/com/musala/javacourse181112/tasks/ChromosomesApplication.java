package com.musala.javacourse181112.tasks;

public class ChromosomesApplication {
    /*
Create a Chromosomes application that:
    ** based on human gender, prints chromosomes (male: yx; female: xx)
    ** use switch-based check
    ** parameters supplied by user
    ** prints chromosomes to stdout
    */

    public static void main(final String[] args) {
        final String gender = args[0];

        String chromosomesString = "";
        // to print yx instead, flip gender's order
        switch (gender.toLowerCase()) {
            case "female":
                chromosomesString += "x";
            case "male":
                chromosomesString += "x";
                if (chromosomesString.length() == 2) {
                    break;
                }
            default:
                chromosomesString += "y";
        }

        System.out.println("Chromosomes for gender: " + gender);
        System.out.println(chromosomesString);
    }
}
