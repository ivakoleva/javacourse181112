package com.musala.javacourse181112.tasks;

public class RandomPersonNamesGenerator {
    //        ** configure charset (symbols allowed)
//        ** configure min/max length per word
//        ** random generator component implementation should be dedicated to be reused
//        ** when producing a name - first letter always upper case, other letters lower case
//        ** words joined using a space
//        ** sample runner, for POC purposes
//
//        ** Bonus: names count
    public static void main(final String[] args) {
        String[] stringArray = new String[5];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = (randomGenerator() + randomGenerator());
            System.out.println(stringArray[i]);
        }
    }

    private static String randomGenerator() {
        String result = " ";
        char[] arrayChar = new char[7];

        arrayChar[0] = (char) ((Math.random() * ((90 - 65) + 1)) + 65);

        for (int i = 1; i < arrayChar.length; i++) {
            arrayChar[i] = (char) ((Math.random() * ((122 - 97) + 1)) + 97);
        }

        for (int i = 0; i < arrayChar.length; i++) {
            result = (result + arrayChar[i]);
        }

        return result;
    }

}
