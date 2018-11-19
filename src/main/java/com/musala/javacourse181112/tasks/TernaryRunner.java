package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        yesCounter = value.equals("yes") ? ++yesCounter : yesCounter ;
        noCounter =   value.equals("no") ? ++noCounter :  noCounter ;

        System.out.println(yesCounter);
        System.out.println(noCounter);

        /*
        if("yes".equals(value)) {
            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        }*/

        // TODO: 2-lines implementation, using ternary operator
    }
}
