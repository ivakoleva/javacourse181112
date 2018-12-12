package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if("yes".equals(value)) {
            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        } else if ("asd".equals(value)) {

        } else if ("asd1".equals(value)) {

        }


        yesCounter +=  ("yes".equals(value)) ?   1 : 0;
        noCounter +=  ("no".equals(value)) ?   1 : 0;
    }
}
