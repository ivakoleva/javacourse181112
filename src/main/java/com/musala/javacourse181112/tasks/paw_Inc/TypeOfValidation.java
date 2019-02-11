package com.musala.javacourse181112.tasks.paw_Inc;

import java.nio.charset.Charset;
import java.util.function.Predicate;


public enum TypeOfValidation {
    IS_ASCII(1, string -> Charset.forName("US-ASCII").newEncoder().canEncode(string)),
    IS_INTEGER(2, string -> 0 < Double.valueOf(string) && Double.valueOf(string) <= Integer.MAX_VALUE && Double.valueOf(string) % 1 == 0);

    private Integer label;
    private Predicate<String> checker;

    TypeOfValidation(Integer label, Predicate<String> checker) {
        this.label = label;
        this.checker = checker;
    }

    public boolean test(final String checkedString) {
        return checker.test(checkedString);
    }

    public Integer getLabel() {
        return label;
    }

    public static TypeOfValidation findTypeOrPredicate(final TypeOfValidation searchedPredicate) {
        for (TypeOfValidation typeOfValidation : TypeOfValidation.values()) {
            if (typeOfValidation.getLabel().equals(searchedPredicate.getLabel())) {
                return typeOfValidation;
            }
        }
        return null;
    }
}

