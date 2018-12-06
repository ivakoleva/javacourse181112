package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrimitivesAndWrappersExercise {
    public static void main(String[] args) {
        int integerPrimitive = 32;
        Integer integerWrapper = new Integer(1);
        long longPrimitive = 6L;
        Long longWrapper = new Long(6L);
        short shortPrimitive = 4;
        Short shortWrapper = new Short((short) 6);
        boolean boolPrimitive = false;
        Boolean boolWrapper = new Boolean(false);
        char charPrimitive = 'a';
        Character charWrapper = new Character('a');
        byte bytePrimitive = (byte) 5;
        Byte byteWrapper = new Byte((byte) 5);
        double doublePrimitive = 2.5;
        Double doubleWrapper = new Double(1.1);
        float floatPrimitive = 2.3f;
        Float floatWrapper = new Float(5.1f);
        Object[] objects = {
                integerPrimitive, integerWrapper, longPrimitive, longWrapper, shortPrimitive,
                shortWrapper, charPrimitive, charWrapper, boolPrimitive, boolWrapper, bytePrimitive,
                byteWrapper, doublePrimitive, doubleWrapper, floatPrimitive, floatWrapper};
        System.out.println("From Array:");

        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i] + " ");
        }
        System.out.println(System.lineSeparator() + "From List:");
        Predicate<Object> predicate = (checkedObject) -> checkedObject instanceof Number;
        List<Object> objectList = Arrays.stream(objects).filter(predicate).collect(Collectors.toList());
        objectList.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
