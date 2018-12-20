package com.musala.javacourse181112.ForFun;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next().toLowerCase();
        String dayOfWeek = in.next().toLowerCase();
        Double quantity = in.nextDouble();
        double price = 0;

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.50;
                        break;
                    case "apple":
                        price = quantity * 1.20;
                        break;
                    case "orange":
                        price = quantity * 0.85;
                        break;
                    case "grapefruit":
                        price = quantity * 1.45;
                        break;
                    case "kiwi":
                        price = quantity * 2.70;
                        break;
                    case "pineapple":
                        price = quantity * 5.50;
                        break;
                    case "grapes":
                        price = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                System.out.printf("%.2f", price);
                break;
            case "saturday":
            case "sunday":
                switch (fruit) {
                    case "banana":
                        price = quantity * 2.70;
                        break;
                    case "apple":
                        price = quantity * 1.25;
                        break;
                    case "orange":
                        price = quantity * 0.90;
                        break;
                    case "grapefruit":
                        price = quantity * 1.60;
                        break;
                    case "kiwi":
                        price = quantity * 3.00;
                        break;
                    case "pineapple":
                        price = quantity * 5.60;
                        break;
                    case "grapes":
                        price = quantity * 4.20;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                System.out.printf("%.2f", price);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
