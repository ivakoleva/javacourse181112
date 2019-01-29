package com.musala.javacourse181112.tasks.anotations;

import java.util.Arrays;

public class PrintMethodsWithAnnotationsExample {

    public static void printMethodsWithAnnotations(final Class<?> clazz) {
        Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.getAnnotations().length > 0)
                .forEach(method -> {
                    System.out.println(method.getName());
                    Arrays.stream(method.getDeclaredAnnotations())
                            .map(annotation -> annotation.annotationType().getSimpleName())
                            .forEach(System.out::println);
                });
    }
    // TODO: same about filters
}
