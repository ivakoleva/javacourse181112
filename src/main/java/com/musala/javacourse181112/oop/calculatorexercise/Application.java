package com.musala.javacourse181112.oop.calculatorexercise;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Iva Koleva on 03.01.2019
 */
public class Application {
    public static void main(final String[] args) {

        final Person person1 = new Person();
        person1.setDateOfBirth(LocalDate.of(1987, Month.JANUARY, 1));

        final Person person2 = new Person();
        person2.setDateOfBirth(LocalDate.of(1997, Month.JANUARY, 1));

        final SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.add(20);
        sumCalculator.add(person1);
        sumCalculator.add(person2);
        System.out.println("calculated: " + sumCalculator.calculate());

        sumCalculator.clear();
        System.exit(0);
    }
}
