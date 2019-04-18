package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.Random;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {

        final String value = "yes";

        int yesCounter = 0;
        int noCounter = 0;

        if("yes".equals(value)) {
            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        }

        // TODO: 2-lines implementation, using ternary operator
        if ("yes".equals(value)) {
            yesCounter++;
        } else if ("no".equals(value)) {
            noCounter++;
        } else if ("asd".equals(value)) {

        } else if ("asd1".equals(value)) {

        }

        // TODO: 2-lines implementation, using ternary operator
        /*yesCounter = "yes".equals(value) ? yesCounter + 1 : yesCounter;
        noCounter = "no".equals(value) ? noCounter + 1 : noCounter;*/

        yesCounter += "yes".equals(value) ? 1 : 0;
        noCounter += "no".equals(value) ? 1 : 0;


        String input;

        Random b = new Random();
        boolean bool = b.nextBoolean();
        input = (bool)?"Yes":"No";

        int result = (input.equals(value))?yesCounter++:noCounter++;
        //yesCounter+=input.equals(value)?1:0;
        //noCounter +=input.equals(value)?1:0;
        System.out.println(yesCounter+" "+ noCounter);

    }
}
