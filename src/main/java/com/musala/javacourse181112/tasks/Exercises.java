package com.musala.javacourse181112.tasks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Exercises {
    public static void main(String[] args) {
        //System.out.println("Hello\nDoncho Gluharov");
        //System.out.println(74 + 36);
        /*Scanner input = new Scanner(System.in);
        System.out.print("Input first number:");
        int num1 = input.nextInt();
        System.out.print("Input the second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        System.exit(0);*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("Input first number:");
        double num1 = input.nextInt();
        System.out.print("Input second number:");
        double num2 = input.nextInt();
        double result = (num1 / num2);
        System.out.println("The result is: " + result);*/

        /*System.out.println("a: " + (-5 + 8 * 6));
        System.out.println("b: " + ((55+9) % 9));
        System.out.println("c: " + (20 + -3 * 5 / 8 ));
        System.out.println("d: " + (5 + 15 / 3 * 2 - 8 % 3 ));

        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("Input first number:");
        int num1 = input.nextInt();
        System.out.print("Input second number:");
        int num2 = input.nextInt();
        int result = (num1 * num2);
        System.out.println("The result is: " + result);*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("Input the first number:");
        int num1 = input.nextInt();
        System.out.print("Input the second number:");
        int num2 = input.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "mod" + num2 + "=" + (num1 % num2));*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("Input number:");
        int num1 = input.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + "x" + (i+1) + "=" + (num1 * (i+1)));
        }*/

        /*System.out.println("    J      A    V      V    A     ");
        System.out.println("    J     A A    V    V    A A    ");
        System.out.println("J   J    AAAAA    V  V    AAAAA   ");
        System.out.println(" J J    A     A    VV    A     A  ");*/

        //System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        //System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        /*double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = " + a);*/

        /*double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);*/

        /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x < 1 || x > 9) {
            System.out.println("Invalid score!");
        } else if (x < 4) {
            System.out.println(x * 10);
        } else if (x < 7) {
            System.out.println(x * 100);
        } else {
            System.out.println(x * 1000);
        }*/

        /*Scanner in = new Scanner(System.in);
        String cardString = in.nextLine();
        if(cardString.equals("2")
                || cardString.equals("3")
                || cardString.equals("4")
                || cardString.equals("5")
                || cardString.equals("6")
                || cardString.equals("7")
                || cardString.equals("8")
                || cardString.equals("9")
                || cardString.equals("10")
                || cardString.equals("J")
                || cardString.equals("Q")
                || cardString.equals("K")
                || cardString.equals("A")) {
            System.out.println("yes " + cardString);
        } else {
            System.out.println("no " + cardString);
        }*/
        /*int number1 = 25;
        System.out.println(number1 >> 1);*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);*/


        /*Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        System.out.print("Input the third number: ");
        int num3 = in.nextInt();
        System.out.print("Input the fourth number: ");
        int num4 = in.nextInt();
        System.out.print("Input the fifth number: ");
        int num5 = in.nextInt();

        System.out.println("The average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);*/

        int x = 4;
        if (x < 0) {
            System.out.println("Invalid number");
        } else if (x < 10) {
            System.out.println(1);
        } else if (x < 100) {
            System.out.println(2);
        }

    }
}
