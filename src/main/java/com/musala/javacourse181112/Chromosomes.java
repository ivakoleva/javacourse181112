package com.musala.javacourse181112;

public class Chromosomes {
    public static void main(final String[] args) {
        final String gender = args[0];

        String chromosomesString = "";
        switch (gender.toLowerCase()){
            case "male:"
                chromosomesString += "y";
            case "female":
                chromosomesString += "x";
                if(chromosomesString.length() == 2) {
                    break;
                }

                default:
                    chromosomesString += "x";
    }

}
