package com.musala.javacourse181112.tasks;


//        *** stream the array (Arrays util)
//        *** using instanceof, filter by boolean
//        *** collect to list

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimitivesAndWrappersExercise {
    public static void main(final String[] args) {
        final byte bytePrimitive = 1;
        final Byte byteWrapper = 3;

        final int integerPrimitive = 13;
        final Integer integerWrapper = 6;

        final long longPrimitive = 17L;
        final Long longWrapper = 19L;

        final short shortPrimitive = 12;
        final Short shortWrapper = 5;

        final double doublePrimitive = 3.1468;
        final Double doubleWrapper = 6.066;

        final float floatPrimitive = 2.14f;
        final Float floatWrapper = 6.0f;

        final boolean booleanPrimitive = true;
        final Boolean booleanWrapper = false;

        final char characterPrimitive = 'a';
        final Character characterWrapper = 'A';

        final Object[] dataTypesArray = {bytePrimitive, byteWrapper,
                integerPrimitive, integerWrapper, longPrimitive, longWrapper,
                shortPrimitive, shortWrapper, doublePrimitive, doubleWrapper,
                floatPrimitive, floatWrapper, booleanPrimitive, booleanWrapper,
                characterPrimitive, characterWrapper
        };

        System.out.println("Printing DataTypesArray...");
        for (int i = 0; i < dataTypesArray.length; i++) {
            System.out.print(dataTypesArray[i] + " ");
        }

        Stream<Object> dataTypesArrayToStream = Arrays.stream(dataTypesArray);
        List<Object> dataTypesArrayToList = dataTypesArrayToStream.collect(Collectors.toList());
        System.out.println("\nPrinting dataTypesArrayToList..." + dataTypesArrayToList);
    }
}
