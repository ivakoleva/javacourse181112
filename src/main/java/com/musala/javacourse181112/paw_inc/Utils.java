package com.musala.javacourse181112.paw_inc;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Created by Aykut Ismailov on 7.2.2019 г.
 */
public final class Utils {
    public static final Predicate<String> isASCII = line -> Pattern.matches("[\\x00-\\x7F]+", line);
    public static final Predicate<String> isInteger = string -> Pattern.matches("[0-9]+", string);
    public static final Predicate<Integer> isValidInteger = integer -> integer >= 0;
}
