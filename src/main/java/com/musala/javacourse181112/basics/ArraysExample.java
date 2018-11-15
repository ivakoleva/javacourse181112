package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 15.11.2018
 */
public class ArraysExample {
    public static void main(final String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 1;
        intArray[9] = 10;

        //intArray = new int[intArray.length + 3];
        //intArray = new int[13];

        System.out.println(intArray);

        long[] longArray = {1, 4, 5};
        // System.out.println({1, 4, 5}); // error, expects to have type defined

        boolean[][] twoDimensionalTable = new boolean[2][20]; // 2 rows, 20 columns
        System.out.println(twoDimensionalTable[1][0]); // row 2 column A
    }
}
