package com.musala.javacourse181112.basics;

public class ConditionsExample {
    public static void main(String[] args) {

        // if-else if - else
        if (4 > 5) {
            System.out.println("1");
        } else if (5 > 6) {
            System.out.println("2");
        } else if (7 == 7) {
            System.out.println("3");

        }
        if (false) {
            System.out.println("false");
        } else {
            System.out.println("else");
        }

        // ternery operator

        final String variable = 1 != 1 ? "true" : "false";

    }

}
