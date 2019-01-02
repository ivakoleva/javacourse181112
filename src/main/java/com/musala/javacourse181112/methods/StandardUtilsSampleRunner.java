package com.musala.javacourse181112.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 02.01.2019
 */
public class StandardUtilsSampleRunner {
    public static void main(final String[] args) {
        // utils class usage
        final long sum = StandardUtilsSample.computeSum(1, 2);
        System.out.println(StandardUtilsSample.capitalizeFirstLettersThenConcat("sample", "file", "name"));

        // utils class callback workaround
       /** try {
            final Method method = StandardUtilsSample.class.getDeclaredMethod("capitalizeFirstLettersThenConcat");
            doSomething(method, "asd", "asd");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
*/
        // lambda usage
        LambdaUtilsSample.computeSum.apply(1L, 2L);
    }

    // standard method callback
    public static void doSomething(final Method callback, String... args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (System.currentTimeMillis() % 2 != 0) {
            try {
                callback.invoke(null, args);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            // do nothing
        }
    }
}

// lambda utils class
final class LambdaUtilsSample {
    private LambdaUtilsSample() {
    }

    static final BinaryOperator<Long> computeSum = (i1, i2) -> i1 + i2;


    // TODO: implement capitalizeFirstLettersThenConcat function
}

// classical utils class
final class StandardUtilsSample { // Utils
    private StandardUtilsSample() {
    }

    static long computeSum(final long i1, final long i2) {
        return i1 + i2;
    }

    static String capitalizeFirstLettersThenConcat(final String... strings) {
        return Arrays.stream(strings)
                .map(string -> {
                    string= string.substring(0,1).toUpperCase() + string.substring(1);
                    return string;
                }).collect(Collectors.joining());
    }
}