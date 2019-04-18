package com.musala.javacourse181112.FirstPartJava.oop.calculatorexercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public class SumCalculator {
    private final List<Number> numberList = new ArrayList<>();

    public List<Number> getNumberList() {
        return numberList;
    }

    // method overloading
    public boolean add(final Calculatable calculatable) {
        return numberList.add(calculatable.getValue());
    }

    public boolean add(final Number number) {
        return numberList.add(number);
    }

    public void clear() {
        numberList.clear();
    }

    public boolean remove(final Object o) {
        return numberList.remove(o);
    }

    public int calculate() {
        return numberList.stream()
                .map(Number::intValue)
                .reduce((i1, i2) -> i1 + i2).orElse(0);
    }
}
