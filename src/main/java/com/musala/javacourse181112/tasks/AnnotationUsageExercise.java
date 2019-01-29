package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Iva Koleva on 29.01.2019
 *     ** Annotation usage exercise - using template class tasks.AnnotationUsageExercise
 *         *** print to stdout all annotated class members
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

        System.out.println("- Fields with annotation:");
        Arrays.stream(annotationUsageExerciseClass
                .getFields()).
                filter(field -> field.isAnnotationPresent(SampleAnnotation.class))
                .map(Field::getName)
                .forEachOrdered(System.out::println);

        System.out.println("- Methods with annotation:");
        for (Method method : annotationUsageExerciseClass.getMethods()) {
            if (method.isAnnotationPresent(SampleAnnotation.class)) {
                System.out.println(method.getName());
            }
        }


//        annotationUsageExerciseClass.getFields()[0].getAnnotations();
//        annotationUsageExerciseClass.getMethods()[0].getAnnotations();


//        annotationUsageExerciseClass.getAnnotation(SampleAnnotation.class);
    }
}