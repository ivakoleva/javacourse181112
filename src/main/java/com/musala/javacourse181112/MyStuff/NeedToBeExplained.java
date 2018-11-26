package com.musala.javacourse181112.MyStuff;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class NeedToBeExplained {
    public static void main(final String[] args) {
        String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if ("yes".equals(value)) {
            yesCounter++;
        } else if ("no".equals(value)) {
            noCounter++;
        }

        // TODO: 2-lines implementation, using ternary operator
        /*yesCounter = "yes".equals(value) ? yesCounter + 1 : yesCounter;
        noCounter = "no".equals(value) ? noCounter + 1 : noCounter;*/

        yesCounter += "yes".equals(value) ? 1 : 0;
        noCounter += "no".equals(value) ? 1 : 0;
    }
}
