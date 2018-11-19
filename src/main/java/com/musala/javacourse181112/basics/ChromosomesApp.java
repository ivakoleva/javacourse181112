package com.musala.javacourse181112.basics;

public class ChromosomesApp {
    public static void main(String[] args) {
        final String gender = args [0];

        String chromosomesString = "";
        switch (gender.toLowerCase()){
            case "male" :
                chromosomesString += "y";
            case "female" :
                chromosomesString += "x";
                if (chromosomesString.length() == 2){
                    break;
                }
            default:
                chromosomesString += "x";
        }
        System.out.println("Chromosomes for gender : " + gender);
        System.out.println(chromosomesString);
    }
}
