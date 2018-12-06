package com.musala.javacourse181112.tasks;


import java.util.Arrays;
import java.util.stream.Collectors;

public class PrimitivesAndWrappersExercise {
    public static void main(String[] args) {

        final byte bytePrimitive = new Byte((byte) 1);
        final Byte byteWrapper = 1;

        final char charPrimitive = new Character('a');
        final Character charWrapper = 'a';

        final short shortPrimitive = new Short((short) 1);
        final Short shortWrapper = 1;

        final int integerPrimitive = new Integer(1);
        final Integer integerWrapper = 1;

        final long longPrimitive = new Long(1);
        final Long longWrapper = 1L;

        final float floatPrimitive = new Float(1.0f);
        final Float floatWrapper = 1.0f;

        final double doublePrimite = new Double(1.00);
        final Double doubleWrapper = 1.0;

        final boolean booleanPrimitive = new Boolean(true);
        final Boolean booleanWrapper = true;

        final Object[] testArray = {bytePrimitive, byteWrapper, charPrimitive, charWrapper, shortPrimitive,
                shortWrapper, integerPrimitive, integerWrapper, longPrimitive, longWrapper,
                floatPrimitive, floatWrapper, doublePrimite, doubleWrapper, booleanPrimitive, booleanWrapper};
        System.out.println("for each loop: ");
        for (Object object : testArray) {
            System.out.println(object);
        }

        System.out.println("forEach stream: ");
        Arrays.stream(testArray).filter(object -> object instanceof Boolean)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
