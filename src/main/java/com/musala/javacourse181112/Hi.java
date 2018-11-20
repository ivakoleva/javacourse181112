package com.musala.javacourse181112;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 12.11.2018,
 * a significant bit of leva.bg project.
 */
public class HelloWorld {
    static final String CONSTANT_VALUE = "asd";
    String value;

    public static void main(String[] args) {
        System.out.println("Hello!"); //hardcoded
        System.out.println(args[0]);//runtime

        System.gc();

        System.exit(status:0);

    }

    public static void defineAndInitializePrimitives(String value) {
        String value1;
        String myVariable;
        myVariable = "asd";
        byte myByteVariable = (byte) (123 + 1);
        short myShortVariable;
        int myIntVariable = 1;
        long myLongVariable = 1L;
        float myFloatVariable = 1.0F;
        double myDoubleVariable = 1.0; // 1.0d
        boolean myBooleanVariable = true; //false

        char myCharVariable = 'a';
        char a = 97;
        char a1 = '\u0061';

        //numeric systems
        int decimalInt = 100;//decimal
        int octalInt = 0144;//octal
        int hexInt = 0x64;//hexadecimal
        int classFieldInt;//0
        String classFieldString;//null
        //scientific notation
        }


        System.out.println(1212121);

        final String[] stringArray = new String[3];
        // final for reference types does not allow to be reinitialized
        //in case of arrays - elemnts can be modified
        stringArray[0]="value1";

        final String[][] stringTwoDimensionalArray=new String[3][5];
        stringTwoDimensionalArray[0][0]="value0.0";
        stringTwoDimensionalArray[1][4]="value1.4";
        stringTwoDimensionalArray[2][2]="value2.2";

        final String[][] stringTwoDimensionalArray1={
                {"value0.0",null,null,null,null},
                {null, null, null, null, "value1.4"},
                {null,null,"value2.2",null,null}


    };

}
}
