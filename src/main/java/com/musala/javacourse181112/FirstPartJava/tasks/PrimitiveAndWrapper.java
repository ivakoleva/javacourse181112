package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrimitiveAndWrapper {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        boolean boolPrim = false;
        Boolean boolWrapper = new Boolean (boolPrim);
        list.add(boolPrim);
        list.add(boolWrapper);

        int integerPrim = 1;
        Integer integerWrapper = new Integer(integerPrim);
        list.add(integerPrim);
        list.add(integerWrapper);

        short shortPrim = 101;
        Short shortWrapper = new Short(shortPrim);
        list.add(shortPrim);
        list.add(shortWrapper);

        long longPrim = 10L;
        Long longWrapper = new Long(longPrim);
        list.add(longPrim);
        list.add(longWrapper);

        char charPrim = 'b';
        Character charWrapper = new Character(charPrim);
        list.add(charPrim);
        list.add(charWrapper);

        byte bytePrim = (byte) 110;
        Byte byteWrapper = new Byte(bytePrim);
        list.add(bytePrim);
        list.add(byteWrapper);

        float floatPrim = 1001.10f;
        Float floatWrapper = new Float(floatPrim);
        list.add(floatPrim);
        list.add(floatWrapper);

        double doublePrim = 111.01010101;
        Double doubleWrapper = new Double(doublePrim);
        list.add(doublePrim);
        list.add(doubleWrapper);

        list.forEach(o -> System.out.println(o.getClass().getSimpleName() + " "+ o.toString()));
        System.out.println("---------------------");

        Predicate<Object> predicate  = (obj)-> obj instanceof Number;
        list.forEach(curObj -> System.out.println(predicate.test(curObj) + " "+ curObj.toString()));
    }
}
