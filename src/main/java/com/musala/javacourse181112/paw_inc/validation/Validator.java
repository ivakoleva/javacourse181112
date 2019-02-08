package com.musala.javacourse181112.paw_inc.validation;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;

/**
 * Created by Aykut Ismailov on 7.2.2019 г.
 *
 * Validator class
 *
 *Validates given parameters using TypeOfValidation Enum
 */
public final class Validator {


    public static boolean validateArgumentsOfInvokedMethod(final String[] arguments, final TypeOfValidation... typeOfValidations) {
        if (arguments.length != typeOfValidations.length) {
            return false;
        }
        boolean result = true;

        for (int i = 0; i < arguments.length; i++) {
            TypeOfValidation currentTypeOfValidation = TypeOfValidation.findTypeOrPredicate(typeOfValidations[i]);
            if (currentTypeOfValidation != null) {
                result = result && currentTypeOfValidation.test(arguments[i]);
            } else {
                return false;
            }
        }

        return result;
    }

    public static boolean validateArgumentsOfInvoke(final AnimalCenterManager animalCenterManager, final String[] arguments, int n) {
        return animalCenterManager != null && arguments != null && arguments.length == n;
    }

    public static boolean validateASCII(final String checkedString) {
        return TypeOfValidation.IS_ASCII.test(checkedString);
    }


}
