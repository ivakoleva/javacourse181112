package com.musala.javacourse181112.practice;

public class AssignmentOperator {
    public static void main(String[] args) {

        int number1, number2; // local variables - use only in this main method

        //Assigning 5 to number1
        number1 = 5; // initialization
        System.out.println(number1);

        // Assigning value of variable number2 to number1
        number2 = number1;
        System.out.println(number2);

        number1 = 6;
        System.out.println(number2);
        System.out.println(number1);
    }
}
