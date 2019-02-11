package com.musala.javacourse181112.paw_inc;

import java.nio.charset.Charset;
import java.util.function.Predicate;

public final class ValidationUtils {
    public static Predicate<String> isASCII = s -> Charset.forName("US-ASCII").newEncoder().canEncode(s);
    public static Predicate<Integer> isPositiveInt = integer -> integer > 0;

    private ValidationUtils() {
    }
}
