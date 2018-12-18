package com.musala.javacourse181112.generics;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class ClassLevelGenericsExample<T, U> {
    private T field1;
    private U field2;
    //private T field3;

    private Class<T> field1Class;
    private Class<U> field2Class;

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public U getField2() {
        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }

    public void setField1AndField2(final T field1, final U field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public ClassLevelGenericsExample() {
    }

    public ClassLevelGenericsExample(final Class<T> field1Class, final Class field2Class) {
        this.field1Class = field1Class;
        this.field2Class = field2Class;
    }

    public static void main(final String[] args) {
        // raw type
        final ClassLevelGenericsExample classLevelGenericsExampleRaw = new ClassLevelGenericsExample();

        // generics type
        final ClassLevelGenericsExample<String, Integer> classLevelGenericsExample = new ClassLevelGenericsExample<String, Integer>(); // < Java 7 is required
        final ClassLevelGenericsExample<Integer, Double> classLevelGenericsExampleIntegerDouble = new ClassLevelGenericsExample<>(); // Java >= 7 type inference, compiler deduces types based on variable definition

        // usage
        classLevelGenericsExample.setField1("asd");
        classLevelGenericsExample.setField2(12);
        classLevelGenericsExampleIntegerDouble.setField1(13);
        classLevelGenericsExampleIntegerDouble.setField2(13.0d);
        System.out.println(classLevelGenericsExampleIntegerDouble.getField2());

        // additional type meta-information about each field, since generics are available only compile-type
        // usable if we need field types in runtime
        final ClassLevelGenericsExample<Integer, Integer> classLevelGenericsExampleIntegerInteger = new ClassLevelGenericsExample<>(Integer.class, Integer.class);
    }
}
