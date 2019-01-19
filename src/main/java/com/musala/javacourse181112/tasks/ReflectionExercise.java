package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;
class SampleClass {
    private String field1;
    private int field2;

    public SampleClass() {
    }

    public SampleClass(String field1) {
        this.field1 = field1;
    }

    public SampleClass(int field2) {
        this.field2 = field2;
    }

    public SampleClass(String field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }
}

public class ReflectionExercise {
    public static void main(String[] args) throws Exception {

        final List<SampleClass> sampleObjects = new ArrayList<>();

        sampleObjects.add(SampleClass.class
                .getDeclaredConstructor().newInstance());

        sampleObjects.add(SampleClass.class
                .getDeclaredConstructor(String.class).newInstance("DAL GOSPOD DOBRO"));

        sampleObjects.add(SampleClass.class
                .getDeclaredConstructor(int.class).newInstance(3));

        sampleObjects.add(SampleClass.class
                .getDeclaredConstructor(String.class,int.class).newInstance("DA AM NE",2));

        sampleObjects.forEach(System.out::println);
    }



}
