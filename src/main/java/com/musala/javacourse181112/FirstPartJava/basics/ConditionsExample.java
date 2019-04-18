package com.musala.javacourse181112.FirstPartJava.basics;

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

        // switch
        String value = "yes";
        if ("yes".equals(value)) {
            System.out.println("value: yes");
        } else if ("no".equals(value)) {
            System.out.println("value: no");
        } else if ("asd".equals(value)) {
            System.out.println("value: asd");
        } else if ("asd1".equals(value)) {
            System.out.println("value: asd1");
        }

        switch (value) {
            case "yes":
                //
                System.out.println("value: yes");
                //break;
            case "no":
                System.out.println("value: no");
                //break;
            case "asd":
                System.out.println("value: asd");
                //break;
            case "asd1":
                System.out.println("value: asd1");
                //break;
            default:
                System.out.println("default");
                break;
        }

        switch (value) {
            case "prof":
                //
                System.out.println("value: yes");
                //break;
            case "dr":
                System.out.println("value: no");
                //break;
            case "a":
                System.out.println("value: asd");
                //break;
        }
    }
}
