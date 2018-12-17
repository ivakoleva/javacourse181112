package com.musala.javacourse181112.generics;

import java.util.Collections;
import java.util.List;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class MethodGenericsExample<T> {
    // method-level T shadows class-level T
    private <T> T printValueThenReturn(final T value) {
        System.out.println(value);
        return value;
    }

    // this T is not related to T above
    private <T> List<T> getSingletonList(final T value) {
        return Collections.singletonList(value);
    }

    public static void main(final String[] args) {
        final MethodGenericsExample<Long> methodGenericsExample = new MethodGenericsExample<>();

        final String value = methodGenericsExample.printValueThenReturn("!23");
        final Integer value1 = methodGenericsExample.printValueThenReturn(123);

        final List<Double> doubleList = methodGenericsExample.getSingletonList(100D);
    }
}

class ClassShadowingExample {
    private String value;

    private void test(final String value) {
        System.out.println(value); // this.value would resolve to class field access
    }
}