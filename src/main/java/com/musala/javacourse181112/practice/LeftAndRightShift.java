package com.musala.javacourse181112.practice;

public class LeftAndRightShift {
    public static void main(String[] args) {
        int number = 212;
        System.out.println(Integer.toBinaryString(212));

        System.out.println(number << 1);
        System.out.println(number << 0);
        System.out.println(number << 4);

        System.out.println(number >> 1);
        System.out.println(number >> 0);
        System.out.println(number >> 8);
    }
}
