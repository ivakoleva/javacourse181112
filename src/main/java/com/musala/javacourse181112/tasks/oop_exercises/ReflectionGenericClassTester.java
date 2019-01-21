package com.musala.javacourse181112.tasks.oop_exercises;

public class ReflectionGenericClassTester {

    //this class can extend ReflectionGenericClass<String> for example

    public static void main(String[] args) throws CloneNotSupportedException {
        final ReflectionGenericClass<Integer> integerReflectionGenericClass = new ReflectionGenericClass<>();
        final ReflectionGenericClass<Double> doubleReflectionGenericClass = new ReflectionGenericClass<>();
        final ReflectionGenericClass<String> stringReflectionGenericClass = new ReflectionGenericClass<>();

        integerReflectionGenericClass.setValue(10);
        doubleReflectionGenericClass.setValue(25.20);
        stringReflectionGenericClass.setValue("hello");

        System.out.println("Integer value: " + integerReflectionGenericClass.getValue());
        System.out.println("Double value: " + doubleReflectionGenericClass.getValue());
        System.out.println("String value: " + stringReflectionGenericClass.getValue());

        final ReflectionGenericClass<Integer> clone1 = integerReflectionGenericClass.clone();
        final ReflectionGenericClass<Double> clone2 = doubleReflectionGenericClass.clone();
        final ReflectionGenericClass<String> clone3 = stringReflectionGenericClass.clone();
        System.out.println();
    }
}
