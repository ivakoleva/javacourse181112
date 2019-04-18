package com.musala.javacourse181112.FirstPartJava.basics;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 13.11.2018,
 * a significant bit of leva.bg project.
 */
public class DataTypesExample {
    /**
     * This is a constant that is immutable (non-modifiable)
     */
    static final String CONSTANT_VALUE = "asd";

    int classFiledInt; // 0
    String classFieldString; // null

    public static void defineAndInitializePrimitives(int primitiveArgument) {
        byte myByteVariable = (byte) 123 + 1;
        short myShortVariable = 1000;
        int myIntVariable = 1 + 1;
        //int myIntVariable1 = 1;
        System.out.println(myIntVariable);
        long myLongVariable = 1L;

        float myFloatVariable = 1.0f;
        double myDoubleVariable = 1.0; // d

        System.out.println(1212123123); // hardcoded, inferred int

        boolean myBooleanVariable = true; // false

        char myCharVariable = 'a';
        char a = 97;
        char a1 = '\u0061';

        // numeric systems
        int binaryInt = 0b0000000001100100; // binary (2-based)
        int octalInt = 0144; // octal (8-based)
        int decimalInt = 100; // decimal (10-based)
        int hexInt = 0x64; // hexadecimal (16-based)

        // scientific notation
        double scientificInt = 1e2; // E

        int k;
        int i = k = 0;
        // k == 0 && i == 0
    }

    /**
     * This is a javadoc comment
     * @param referenceArgument
     */
    public static void defineAndInitializeReferences(String referenceArgument) {
        String value1; // local variable

        final String myStringVariable = "asd\"\\" + 1 + 1 * 2; // final is immutable
        //myStringVariable = "asd1"; // single-line comment

        /*
        multi-line comment
        multi-line comment
         */

        // asd"\12
        System.out.println(myStringVariable);
    }

    public static void main(String[] args) {
        defineAndInitializeReferences(null);
        // method 2
        // method 3
    }
}
