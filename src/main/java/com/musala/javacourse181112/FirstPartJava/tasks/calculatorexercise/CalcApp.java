package com.musala.javacourse181112.FirstPartJava.tasks.calculatorexercise;

import com.musala.javacourse181112.FirstPartJava.tasks.Generics.Person;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalcApp {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        List<Person> list = IntStream.range(1, 10).mapToObj(i -> new Person("Ivan" + i*10, i * 1)).collect(Collectors.toList());

        list.forEach(person -> {
            try {
                Calculator calc = new Calculator(person, 22);
                calc.calculate();
                Calculator.calculateStatic(person,22);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        });
    }
}
