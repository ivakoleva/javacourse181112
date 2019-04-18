package com.musala.javacourse181112.FirstPartJava.basics;

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

        final String[] stringArray = new String[3];
        // final for reference types does not allow to be reinitialized
        // in case of arrays - elements can be modified
        stringArray[0] = "value1";
        stringArray[0] = "value1a";
        //stringArray[1] = null;
        //stringArray[2] = null;
        //stringArray = new String[4]; //because of final

        final String[] stringArray1 = {"value1a", null, null};

        final String[][] stringTwoDimensionalArray = new String[3][5];
        stringTwoDimensionalArray[0][0] = "value0.0";
        stringTwoDimensionalArray[1][4] = "value1.4";
        stringTwoDimensionalArray[2][2] = "value2.2";

        String value2_2 = stringTwoDimensionalArray[2][2];
        value2_2 = "asd";

        System.out.println("Printing array value - by position; by variable");
        System.out.println(stringTwoDimensionalArray[2][2]);
        System.out.println(value2_2);

        final String[][] stringTwoDimensionalArray1 = {
                {"value0.0", null, null, null, null},
                {null, null, null, null, "value1.4"},
                {null, null, "value2.2", null, null}
        };
    }
}
