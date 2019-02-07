package com.musala.javacourse181112.paw_inc.util;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Created by Aykut Ismailov on 7.2.2019 г.
 */
public enum TypeOfPredicate {
    IS_ASCII("word", line -> Pattern.matches("[\\x00-\\x7F]+", line)),
    IS_INTEGER("integer", string -> Pattern.matches("[0-9]+", string) && Long.valueOf(string) <= Integer.MAX_VALUE);

    private Predicate<String> checker;
    private String label;

    TypeOfPredicate(String label, Predicate<String> checker) {
        this.label = label;
        this.checker = checker;
    }

    public boolean test(final String checkedString) {
        return checker.test(checkedString);
    }

    public String getLabel() {
        return label;
    }

    public static TypeOfPredicate findTypeOrPredicate(final String searchedLabel) {
        for (TypeOfPredicate typeOfPredicate : TypeOfPredicate.values()) {
            if (typeOfPredicate.label.equals(searchedLabel)) {
                return typeOfPredicate;
            }
        }
        return null;
    }
}
