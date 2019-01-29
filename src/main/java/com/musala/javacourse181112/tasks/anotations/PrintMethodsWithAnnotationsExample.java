package com.musala.javacourse181112.tasks.anotations;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintMethodsWithAnnotationsExample {
    public static void printClassAnnotationsInfo(final Class<?> clazz) {
        Method[] arrayMethods = clazz.getDeclaredMethods();
        Field[] arrayFields = clazz.getDeclaredFields();

        printAnnotationsInfo(arrayMethods);
        //printAnnotationsInfo(arrayFields); //Duplicate bcs not a common interface to combine 'Parameters' and 'methods' in one Method

         Arrays.stream(arrayFields)
                .filter(field -> field.getAnnotations().length > 0)
                .forEach(method -> {
                    System.out.println(method.getName());
                    Arrays.stream(method.getDeclaredAnnotations())
                            .map(annotation -> annotation.annotationType().getSimpleName())
                            .forEach(System.out::println);
                });
    }


    // not a common interface<T> to combine 'Parameters' and 'methods' in one Method
    private static <T extends Executable> void printAnnotationsInfo(T[] arrayFields) {
        Arrays.stream(arrayFields)
                .filter(method -> method.getAnnotations().length > 0)
                .forEach(method -> {
                    System.out.println(method.getName());
                    Arrays.stream(method.getDeclaredAnnotations())
                            .map(annotation -> annotation.annotationType().getSimpleName())
                            .forEach(System.out::println);
                });
    }
}
