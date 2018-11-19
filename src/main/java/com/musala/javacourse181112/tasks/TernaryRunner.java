package com.musala.javacourse181112.tasks;

import java.util.Random;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {
        final String value = "Yes";
        String input;
        int yesCounter = 0;
        int noCounter = 0;

        Random b = new Random();
        boolean bool = b.nextBoolean();
        input = (bool)?"Yes":"No";

        int result = (input.equals(value))?yesCounter++:noCounter++;
        //yesCounter+=input.equals(value)?1:0;
        //noCounter +=input.equals(value)?1:0;
        System.out.println(yesCounter+" "+ noCounter);

    }
}
