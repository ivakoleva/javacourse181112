package com.musala.javacourse181112.paw_inc.util;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;

/**
 * Created by Aykut Ismailov on 7.2.2019 г.
 */
public final class Utils {


    public static boolean validateTypeOfArguments(final String[] arguments, final String[] typeOfArgument) {
        if (arguments.length != typeOfArgument.length) {
            return false;
        }
        boolean result = true;

        for (int i = 0; i < arguments.length; i++) {
            result = result && TypeOfPredicate.findTypeOrPredicate(typeOfArgument[i]).test(arguments[i]);
        }

        return result;
    }

    public static boolean validateArgumentsOfInvoke(final AnimalCenterManager animalCenterManager, final String[] arguments, int n) {
        return animalCenterManager != null && arguments != null && arguments.length == n;
    }

    public static boolean validateASCII(final String checkedString) {
        return TypeOfPredicate.IS_ASCII.test(checkedString);
    }


}
