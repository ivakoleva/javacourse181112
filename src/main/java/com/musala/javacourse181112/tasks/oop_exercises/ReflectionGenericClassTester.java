package com.musala.javacourse181112.tasks.oop_exercises;

public class ReflectionGenericClassTester {

    //this class can extend ReflectionGenericClass<String> for example

    public static void main(String[] args) {
        ReflectionGenericClass<Integer> integerReflectionGenericClass = new ReflectionGenericClass<>();
        ReflectionGenericClass<Double> doubleReflectionGenericClass = new ReflectionGenericClass<>();
        ReflectionGenericClass<String> stringReflectionGenericClass = new ReflectionGenericClass<>();

        integerReflectionGenericClass.setValue(new Integer(10));
        doubleReflectionGenericClass.setValue(new Double(25.20));
        stringReflectionGenericClass.setValue(new String("hello"));

        System.out.println("Integer value: " + integerReflectionGenericClass.getValue());
        System.out.println("Double value: " + doubleReflectionGenericClass.getValue());
        System.out.println("String value: " + stringReflectionGenericClass.getValue());
    }
}
