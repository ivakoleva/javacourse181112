package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitivesAndWrappersExercise {
    public static void main(final String[] args) {

        final byte byteNumber = new Byte((byte) 10);
        final short shortNumber = new Short((short) 20);
        final int intNumber = new Integer(30);
        final long longNumber = new Long(40L);
        final float floatNumber = new Float(50.5f);
        final double doubleNumber = new Double(60.6);
        final boolean booleanPrimitive = new Boolean(false);
        final char charPrimitive = new Character('a');

        final Byte byteWrapper = 1;
        final Short shortWrapper = 2;
        final Integer integer = 3;
        final Long longWrapper = 4L;
        final Float floatWrapper = 5.5f;
        final Double doubleWrapper = 6.6;
        final Boolean booleanWrapper = true;
        final Character character = 'b';

        final Object[] array = {byteNumber, shortNumber, intNumber, longNumber, floatNumber, doubleNumber, charPrimitive, booleanPrimitive,
                byteWrapper, shortWrapper, integer, longWrapper, floatWrapper, doubleWrapper, character, booleanWrapper,};

        System.out.println("Print the array ");
        printArray(array);

        System.out.println(System.lineSeparator() + "Stream array ");
        Arrays.stream(array).forEach(element -> System.out.print(element + " "));

        System.out.println(System.lineSeparator() + "Filter by Boolean");
        doFilterByBoolean(array);
    }

    private static void printArray(final Object[] array) {
        for (Object element : array) {
            System.out.print(element + " ");
        }
    }

    private static void doFilterByBoolean(final Object[] array) {
        final List<Object> arrayList = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Boolean) {
                arrayList.add(element);
            }
        }
        for (Object element : arrayList) {
            System.out.print(element + " ");
        }
    }
}

