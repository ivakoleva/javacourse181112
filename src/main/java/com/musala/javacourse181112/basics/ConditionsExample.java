package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class ConditionsExample {
    public static void main(final String[] args) {

        // if-elseif-else
        if (true) {
            System.out.println("if");
        }

        if (4 > 5) {
            System.out.println("0");
        } else if (5 > 6) {
            System.out.println("1");
        } else if (6 > 7) {
            System.out.println("2");
        } else if (7 == 7) {
            System.out.println("3");
        }

        if (false) {
            System.out.println("false");
        } else {
            System.out.println("else");
        }
        /*if (false) System.out.println("false");
        else System.out.println("else");
            System.out.println("."); // outside else clause*/

        if (false) {
            System.out.println("if");
        } else if (false) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }

        // ternary operator ?:
        final String variable = 1 != 1 ? "true" : "false";
    }
}
