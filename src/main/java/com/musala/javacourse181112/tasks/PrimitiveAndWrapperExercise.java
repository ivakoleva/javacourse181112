package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 ** Primitives and Wrappers exercise
 *** define and initialize all supported types of primitives and their respective wrappers
 *** loop and print array to stdout
 *** stream the array (Arrays validation)
 *** using instanceof, filter by boolean
 *** collect to list
 */
public class PrimitiveAndWrapperExercise {
    public static void main(String[] args) {

        int integerPrimitive = 1;
        Integer integerWrapper = new Integer(1);

        long longPrimitive = 2L;
        Long longWrapper = new Long(2L);

        short shortPrimitive = 3;
        Short shortWrapper = new Short((short) 3);

        boolean boolPrimitive = false;
        Boolean boolWrapper = new Boolean(false);

        char charPrimitive = 'a';
        Character charWrapper = new Character('a');

        byte bytePrimitive = (byte) 5;
        Byte byteWrapper = new Byte((byte) 5);

        double doublePrimitive = 6.6;
        Double doubleWrapper = new Double(6.6);

        float floatPrimitive = 7.7f;
        Float floatWrapper = new Float(7.7f);

        Object[] objects = {integerPrimitive, integerWrapper, longPrimitive, longWrapper, shortPrimitive, shortWrapper, charPrimitive, charWrapper, boolPrimitive, boolWrapper, bytePrimitive, byteWrapper, doublePrimitive, doubleWrapper, floatPrimitive, floatWrapper};

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
