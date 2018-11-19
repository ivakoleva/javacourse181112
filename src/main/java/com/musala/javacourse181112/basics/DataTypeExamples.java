package com.musala.javacourse181112.basics;

public class DataTypeExamples {
    public static void defineAndInitializePrimitives(String primitives) {
        byte myByteVariable = (byte) (123 + 1); //typecast
        short myShorVariable = 10000;
        int myIntVariable = 1;
        long myLongVar = 1L;
        float myFloatVar = 1.0f;
        double myDoubleVariable = 1.0; //d
        System.out.println(121212121);  // hardcoded, inferred int
        boolean myBooleanVariable = true; // false
        char myCharVariable = 'a';
        char a = 97;
        char a1 = '\u0061';
        //numeric syst
        int binaryInt =  0b0000000001100100; //binary
        int decimalInt = 100; //decimal
        int octalInt = 0144; // octal
        int hexInt = 0x64; // hexadecimal
        double scientificInt =1e2; // E



    }
    public static void defineAndInitializeReferences(String referenceArgument) {
        String value1; // local ariable
        final String myStringVariable = "asd"; //final is immutable
//        myStringVariable = "asd1";
        /*
        multi
        line
        comment
         */

    }

    public static void main(String[] args) {
        defineAndInitializePrimitives(null);
        //method 2
        //method 3
    }

}
