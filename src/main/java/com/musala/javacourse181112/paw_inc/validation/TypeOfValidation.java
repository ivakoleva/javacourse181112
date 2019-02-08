package com.musala.javacourse181112.paw_inc.validation;

import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * Created by Aykut Ismailov on 7.2.2019 г.
 *
 * Validator enum
 *
 * Stores different types of validation:
 *      ASCII validation,
 *      Integer validation
 */
public enum TypeOfValidation {
    IS_ASCII(1, line -> Pattern.matches("[\\x00-\\x7F]+", line)),
    IS_INTEGER(2, string -> Pattern.matches("[0-9]+", string) && Long.valueOf(string) <= Integer.MAX_VALUE);

    private Predicate<String> checker;
    private Integer label;

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
