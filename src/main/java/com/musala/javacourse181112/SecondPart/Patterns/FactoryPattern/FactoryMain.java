package com.musala.javacourse181112.SecondPart.Patterns.FactoryPattern;

import java.io.IOException;

public class FactoryMain {
    public static void main(String[] args) {
        Order order = Order.createOrder("/home/bobo/testFolder");
        order.isValid(2);
        try {
            order.logOrder(2,"214124");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
