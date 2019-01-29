package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

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
        // TODO: implement
        final Class<AnnotationUsageExercise> annotationUsageExerciseClass = AnnotationUsageExercise.class;

        annotationUsageExerciseClass.getFields()[0].getAnnotations();
        annotationUsageExerciseClass.getMethods()[0].getAnnotations();


//        annotationUsageExerciseClass.getAnnotation(SampleAnnotation.class);
    }
}