package com.musala.javacourse181112.tasks;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimitivesАndWrappersЕxercise {
    public static void main(String[] args) {
        /* *** define and initialize all supported types of primitives and their respective wrappers
         *** loop and print array to stdout
         *** stream the array (Arrays util)
         *** using instanceof, filter by boolean
         *** collect to list*/
        boolean myBoolean = new Boolean(false);
        char myChar = new Character('a');
        byte myByte = new Byte((byte) 8);
        short myShort = new Short((short) 18);
        int myInt = new Integer(20);
        long myLong = new Long(30L);
        float myFloat = new Float(29.4f);
        double myDouble = new Double(33.3);

        Boolean booleanWrapper = true;
        Character character = 'd';
        Byte byteWrapper = 12;
        Short shortWrapper = 2;
        Integer integer = 4;
        Long longWrapper = 6L;
        Float floatWrapper = 2.3f;
        Double doubleWrapper = 7.7;

        Object[] myArray = {myBoolean, myChar, myByte, myShort, myInt, myLong, myFloat, myDouble, booleanWrapper,
                character, byteWrapper, shortWrapper, integer, longWrapper, floatWrapper, doubleWrapper};

        System.out.println("Print myArray");
        printArray(myArray);

        System.out.println(System.lineSeparator() + "Stream array ");
        Arrays.stream(myArray).forEach(element -> System.out.println(element + " "));

        System.out.println(System.lineSeparator() + "Filter by Boolean");
        doFilterByBoolean(myArray);
    }


    private static void printArray(Object[] myArray) {
        for (Object element : myArray) {
            System.out.println(element + " ");
        }
    }

    private static void doFilterByBoolean(Object[] myArray) {
        List<Object> arrayList = new ArrayList<>();
        for (Object element : myArray) {
            if (element instanceof Boolean) {
                arrayList.add(element);
            }
        }
        for (Object element : arrayList) {
            System.out.println(element + " ");
        }
    }
}
