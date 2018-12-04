package com.musala.javacourse181112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitivesAndWrapersExercise {
    public static void main(final String[] args) {
        byte bytePrimitive = 1;
        Byte byteObject = new Byte(bytePrimitive);

        int intPrimitive = 20;
        Integer intObject = new Integer(intPrimitive);

        float floatPrimitive = 5.9f;
        Float floatObject = new Float(floatPrimitive);

        double doublePrimitive = 155.3;
        Double doubleObject = new Double(doublePrimitive);

        char characterPrimitive = 'm';
        Character charObject = new Character(characterPrimitive);

        boolean booleanPtimitive = true;
        Boolean boolObject = new Boolean(booleanPtimitive);


        final Object[] array = {bytePrimitive, byteObject, intPrimitive, intObject, doublePrimitive, floatObject,
                doublePrimitive, doubleObject, characterPrimitive, charObject, booleanPtimitive, boolObject};

        printArray(array);
        Arrays.stream(array).forEach(element -> System.out.println(element));

        final List<Object> arrayList = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Boolean) {
                arrayList.add(element);
            }
        }

        for (Object element : arrayList) {
            System.out.println(element);
        }

    }

    private static void printArray(final Object[] array) {
        for (Object element : array) {
            System.out.println(element);

        }
    }
}

