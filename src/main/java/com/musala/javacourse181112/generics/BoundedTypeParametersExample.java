package com.musala.javacourse181112.generics;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class BoundedTypeParametersExample<T extends Number & Comparable<T>> {
    final T numberField;

    public BoundedTypeParametersExample(final T numberField) {
        this.numberField = numberField;
    }

    public long sumNumberWith(final long value) {
        return value + numberField.longValue();
    }

    public static void main(final String[] args) {
        final BoundedTypeParametersExample<Short> example = new BoundedTypeParametersExample<>((short) 12);
        System.out.println(example.sumNumberWith(100));

        final BoundedTypeParametersExample<ZeroClass> example1 = new BoundedTypeParametersExample<>(new ZeroClass());
        System.out.println(example1.sumNumberWith(100));
    }
}

class ZeroClass extends Number implements Comparable<ZeroClass> {
    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public int compareTo(final ZeroClass o) {
        return Long.compare(o.longValue(), 0L);
    }
}