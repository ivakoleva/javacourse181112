package com.musala.javacourse181112.homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimitivesAndWrappersExercise {
    public static void main(String[] args) {
//        Initialize primitives and wrappers and make an Array with them
        byte bytePrimitive = 1;
        boolean booleanPrimitve = true;
        char charPrimitive = 'a';
        short shortPrimitive = 1000;
        int intPrimitive = 150;
        long longPrimitive = 180;
        float floatPrimitive = 7F;
        double doublePrimitive = 1.8;
        Byte byteWrapper = 0;
        Boolean booleanWrapper = false;
        Character charWrapper = 'b';
        Short shortWrapper = 1500;
        Integer intWrapper = 123456;
        Long longWrapper = 1246574533211245L;
        Float floatWrapper = 1.134F;
        Double doubleWrapper = 1.17;
        String stringExample = "Hello how are you ?";
        Object[] dataTypesArray = {bytePrimitive, byteWrapper,
                booleanPrimitve, booleanWrapper,
                charPrimitive, charWrapper,
                intPrimitive, intWrapper,
                shortPrimitive, shortWrapper,
                longPrimitive, longWrapper,
                floatPrimitive, floatWrapper,
                doublePrimitive, doubleWrapper,
                stringExample, null
        };
//        Print types to stdout
        for (int i = 0; i < dataTypesArray.length; i += 2) {
            System.out.println("Primitive type: " + dataTypesArray[i] + "\n Wrapper class: " + dataTypesArray[i + 1]);
            if (i + 1 == 16) break;
        }

//        check instance of class for elements in Array
        for (int i = 0; i < dataTypesArray.length; i++) {
            if (dataTypesArray[i] instanceof String) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
//        Stream the array and collect it to a list
        Stream<Object> streamedDataTypesArray = Arrays.stream(dataTypesArray);
        List<Object> ListDataTypesArray = streamedDataTypesArray.collect(Collectors.toList());
    }
}
