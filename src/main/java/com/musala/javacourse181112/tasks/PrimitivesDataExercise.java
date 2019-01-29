package com.musala.javacourse181112.tasks;



import java.util.*;
import java.lang.*;
import java.util.stream.Stream;

public class PrimitivesDataExercise {
    public static void main(final String[] args) {

        byte byteNum = 1;
        short shortNum = 13;
        int intNum = 120;
        long longNum = 304L;
        float floatNum = 2.3f;
        double doubleNum = 13.788d;
        char charValue = 'c';
        boolean booleanVavlue = true;

        Byte byteWrapp = byteNum;
        Short shortWrapp = shortNum;
        Integer intWrapp = intNum;
        Long longWrapp = longNum;
        Float floatWrapp = floatNum;
        Double doubleWrapp = doubleNum;
        Character charWrapp = charValue;
        Boolean booleanWrapp = true;


        Object[] arrayPrimitives = new Object[7];
        arrayPrimitives[0] = byteWrapp;
        arrayPrimitives[1] = shortWrapp;
        arrayPrimitives[2] = intWrapp;
        arrayPrimitives[3] = floatWrapp;
        arrayPrimitives[4] = doubleWrapp;
        arrayPrimitives[5] = charWrapp;
        arrayPrimitives[6] = true;

        System.out.println("Array of Primitives : " );
        printArrayPrimitives(arrayPrimitives);

        System.out.println(System.lineSeparator() + "\nStream of the Array : ");



        try (Stream<Object> streamData = Arrays.stream(arrayPrimitives)) {
            streamData.forEach(varData -> System.out.print(varData + " "));
        }catch(Exception e) {}

        System.out.println(System.lineSeparator() + "\nBoolean filtered :");
        BooleanFilter(arrayPrimitives);


    }


    public static void printArrayPrimitives(final Object... arrayPrimitives) {

        for (Object varData : arrayPrimitives) System.out.print(varData + " ");


    }


    public static void BooleanFilter ( final Object... arrayPrimitives){
        List<Object> arrayList = new ArrayList<>();
        for (Object varData : arrayPrimitives) {
            if ( varData instanceof Boolean){
                arrayList.add(varData);
            }

        }

        for (Object varData : arrayList) System.out.println(varData + " ");
    }

}

