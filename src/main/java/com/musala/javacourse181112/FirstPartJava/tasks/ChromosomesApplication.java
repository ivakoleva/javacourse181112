package com.musala.javacourse181112.FirstPartJava.tasks;

import com.musala.javacourse181112.FirstPartJava.basics.Gender;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class ChromosomesApplication {
    public static void main(final String[] args) {
        // validation
        if (args.length == 0 || args[0] == null) {
            printUsageAndExit();
        }
        /*if(!("female".equalsIgnoreCase(args[0]) || "male".equalsIgnoreCase(args[0]))) {
            System.out.println("Insert male|female instead of: " + args[0]);
            printUsageAndExit();
        }*/

        final Gender gender = "female".equalsIgnoreCase(args[0]) ?
                Gender.FEMALE :
                ("male".equalsIgnoreCase(args[0]) ? Gender.MALE : null);
        if (gender == null) {
            System.out.println("Insert male|female instead of: " + args[0]);
            printUsageAndExit();
        }

        String chromosomesString = "";
        // to print yx instead, flip gender's order
        switch (gender) {
            case FEMALE:
                chromosomesString += "x";
            case MALE:
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

    private static void printUsageAndExit() {
        System.out.println("Usage: java ChromosomesApplication male|female");
        System.exit(1);
    }
}
