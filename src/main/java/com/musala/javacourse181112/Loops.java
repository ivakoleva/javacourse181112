package com.musala.javacourse181112;

// OK, naming conventions
public class Loops {
    public static void main(final String[] args) {
        final int value[] = {1, 2, 3};
        usingWhile(value);
        usingFor(value);
        usingForeach(value);
        usingDoWhile(value);
    }

    public static void usingFor(final int[] valueArray) {
        for (int i = 0; i < valueArray.length; i++) {
            System.out.println("Printing in For: " + valueArray[i]);
        }
    }

    public static void usingDoWhile(final int[] valueArray) {
        int i = 0;
        do {
            System.out.println("Printing in Do-while: " + valueArray[i++]);
            //i++;
        } while (i < valueArray.length);
    }

    public static void usingWhile(final int[] valueArray) {
        int i = 0;
        while (i < valueArray.length) {
            System.out.println("Printing in While: " + valueArray[i++]);
            //i++;
        }
    }

    public static void usingForeach(final int[] valueArray) {
        for (int limiterForeach : valueArray) {
            System.out.println("Printing in Foreach: " + limiterForeach);
        }
    }
}