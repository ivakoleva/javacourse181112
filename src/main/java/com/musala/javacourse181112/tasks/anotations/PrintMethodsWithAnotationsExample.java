package com.musala.javacourse181112.tasks.anotations;

import java.util.Arrays;

public class PrintMethodsWithAnotationsExample {
    public static void printMethodsWithAnotations(Class<?> clazz) {
        Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.getAnnotations().length > 0)
                .forEach(method -> {
                    System.out.println(method.getName());
                    Arrays.stream(method.getDeclaredAnnotations())
                            .forEach(System.out::println);
                });
    }
}
