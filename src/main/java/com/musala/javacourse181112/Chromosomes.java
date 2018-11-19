package com.musala.javacourse181112;

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
    }

}
