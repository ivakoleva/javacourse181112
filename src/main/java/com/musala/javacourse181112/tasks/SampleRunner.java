package com.musala.javacourse181112.tasks;

import java.sql.SQLOutput;

public class SampleRunner {
    public static void main(String[] args) {
        byte centuries = 20;
        short years = 2000;
        int days = 730480;
        long hours = 17531520;
        System.out.println(centuries + " centuries is " + years + " years, or " + days + " days, or " + hours + " hours.");

        float floatPI = 3.141592653589793238f;
        double doublePI = 3.141592653589793238;
        System.out.println("Float PI is: " + floatPI);
        System.out.println("Double PI is: " + doublePI);

        float sum =
                0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        float num = 1.0f;
        boolean equal = (num == sum);
        System.out.println("num = " + num + " sum = " + sum + " equal = " + equal);

        int a = 1;
        int b = 2;
        boolean greaterAB = (a > b);
        boolean equalA1 = (a == 1);
        if (greaterAB) {
            System.out.println("A > B");
        } else {
            System.out.println("A <= B");
        }
        System.out.println("greaterAB = " + greaterAB);
        System.out.println("equalA1 = " + equalA1);


        final String[] stringArray = new String[3];
        stringArray[0] = "value1";
        stringArray[0] = "value1a";

        final String[] stringArray1 = {"value1a", null, null};

        final String [][] stringTwoDimensionalArray = new String[3][5];
        stringTwoDimensionalArray[0][0] = "value0.0";
        stringTwoDimensionalArray[1][4] = "value1.4";
        stringTwoDimensionalArray[2][2] = "value2.2";

        final String[][] stringTwoDimensionalArray1 = {
                {"value0.0", null, null, null, null},
                {null, null, null, null, "value1.4"},
                {null, null, "value2.2", null, null}
        };
    }
}
