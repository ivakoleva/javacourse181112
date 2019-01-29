package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Iva Koleva on 29.01.2019
 */
//@SampleAnnotation
@SampleAnnotation
public class AnnotationUsageExercise {
    @SampleAnnotation
    private String annotatedField;
    private String anotherField;

    public String getAnnotatedField() {
        return annotatedField;
    }

    public void setAnnotatedField(String annotatedField) {
        this.annotatedField = annotatedField;
    }

    public String getAnotherField() {
        return anotherField;
    }

    public void setAnotherField(String anotherField) {
        this.anotherField = anotherField;
    }

    @SampleAnnotation
    public void annotatedMethod(final @SampleAnnotation String annotatedArgument,
                                final String anotherArgument) {

    }

    public void anotherMethod() {

    }

    @SampleAnnotation
    public static void main(final String[] args) {
        final Class<AnnotationUsageExercise> annotationUsageExerciseClass = AnnotationUsageExercise.class;

        Arrays.stream(annotationUsageExerciseClass.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(SampleAnnotation.class))
                .map(method -> "Method: " + method.getName())
                .forEach(System.out::println);

        Arrays.stream(annotationUsageExerciseClass.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(SampleAnnotation.class))
                .map(field -> "Field: " + field.getName())
                .forEach(System.out::println);

        Arrays.stream(annotationUsageExerciseClass.getDeclaredAnnotations())
                .filter(annotation -> annotation instanceof SampleAnnotation)
                .map(annotation -> "Annotation: " + annotation.annotationType().getSimpleName())
                .forEach(System.out::println);
    }
}