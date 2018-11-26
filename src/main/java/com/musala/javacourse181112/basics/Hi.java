package com.musala.javacourse181112.basics;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 12.11.2018,
 * a significant bit of leva.bg project.
 */
public class Hi {
    final String CONSTANT_VALUE = "asd";
    String value;

    public static void main(String[] args) {

        System.out.println("Hola!"); // print f - hardcoded
        System.out.println(args[0]); // runtime
        System.gc();
        System.exit(0); //ne se piche status samo se dobavq kato return 0
    }


    public static void defineAndInitializePrimatives(String inputValue) {
        String value1;
        String MyVariable = "asd";
        MyVariable = "5"; // final ne moje da se promenq stava const

        byte mybytevariable = (byte) (120 + 1);
        short myshortvariable;
        int myintvariable = 1;
        long myLongvariable = 1L;
        float myFloatVariable = 1.0f;

        double myDoublevariable = 1.0d; //d
        System.out.println("12312131"); // hardcoded, inferred int

        char mycharvariable = 'a';
        char a = 97;
        char a1 = '\u0061';

        boolean myboolean = true; //falsei
        // numeric systems
        int binaryint = 0b000000001100100; // binarno chislo
        int demicimalInt = 100; //decimal
        int octalInt = 0144; //octal
        int hexInt = 0x64; //hexadecimal


        //scientific notation
        double scientificint = 1e2; // 1 po 10 na 2
        int k;
        int i = (k = 0); // k== 0 && i ==0

    }

    public static void defineAndInitializeReferences(String referenceArgument) {
        String value1; //local variable
        final String myvariable = "asd\"\\" + (1 + 1 * 1); // final is immutable
        /*
          this is my favoutite comment did you know that i love pizza no you didnt mwahahahah
         */
        // asd"\12 asd \3
        System.out.println();
        boolean[][] booleanArray = new boolean [2][20];// 2 rows, 20 columns
        //twoDimensionalTable[1][0]; // row 2 column A
    }

}
