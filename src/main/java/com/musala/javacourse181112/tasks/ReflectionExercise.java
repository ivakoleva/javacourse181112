package com.musala.javacourse181112.tasks;

import java.lang.reflect.Constructor;

public class ReflectionExercise {
    public static void main(String[] args) {

       final Class<SampleClass> clazz=SampleClass.class;

       final Constructor<SampleClass>[] constructors= (Constructor<SampleClass>[]) clazz.getConstructors();



    }

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


    }

}
