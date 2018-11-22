package com.musala.javacourse181112.tasks;

import sun.awt.Symbol;

import java.sql.SQLOutput;

public class SampleRunner {
    public static void main(String[] args) {
        /*byte centuries = 20;
        short years = 2000;
        int days = 730480;
        long hours = 17531520;
        System.out.println(centuries + " centuries is " + years + " years, or " + days + " days, or " + hours + " hours.");*/

        /*float floatPI = 3.141592653589793238f;
        double doublePI = 3.141592653589793238;
        System.out.println("Float PI is: " + floatPI);
        System.out.println("Double PI is: " + doublePI);*/

        /*float sum =
                0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
        float num = 1.0f;
        boolean equal = (num == sum);
        System.out.println("num = " + num + " sum = " + sum + " equal = " + equal);

        int a = 1;
        int b = 2;
        boolean greaterAB = (a > b);
        boolean equalA1 = (a == 1);
        if (greaterAB) {
            System.out.println("A > B");
        } else {
            System.out.println("A <= B");
        }
        System.out.println("greaterAB = " + greaterAB);
        System.out.println("equalA1 = " + equalA1);


        final String[] stringArray = new String[3];
        stringArray[0] = "value1";
        stringArray[0] = "value1a";

        final String[] stringArray1 = {"value1a", null, null};

        final String [][] stringTwoDimensionalArray = new String[3][5];
        stringTwoDimensionalArray[0][0] = "value0.0";
        stringTwoDimensionalArray[1][4] = "value1.4";
        stringTwoDimensionalArray[2][2] = "value2.2";

        final String[][] stringTwoDimensionalArray1 = {
                {"value0.0", null, null, null, null},
                {null, null, null, null, "value1.4"},
                {null, null, "value2.2", null, null}
        };*/

        /*char symbol = 'a';
        System.out.println(
                "The code of '" + symbol + "' is: " + (int) symbol);
        symbol = 'b';
        System.out.println(
                "The code of '" + symbol + "' is: " + (int) symbol);
        symbol = 'A';
        System.out.println(
                "The code of '" + symbol + "' is: " + (int) symbol);

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, " + firstName + "!");
        System.out.println("Your first name is " + fullName + ".");

        Object container = 5;
        Object container2 = "Five";
        System.out.println("The value ot container is: " + container);
        System.out.println("The value ot container is: " + container2);*/

        /*int firstValue = 5;
        int secondValue;
        int thirdValue;
        secondValue = firstValue;
        thirdValue = firstValue = 3;*/

        /*String name = new String();
        float heightInMeters = 1.74f;*/

        /*String greeting = "Hello World!";
        String message = greeting;
        System.out.println(greeting);*/

        /*int i = 42;
        char ch = 'A';
        boolean result = true;
        Object obj = 42;
        String str = "Hello";
        byte[] bytes = {1, 2, 3};

        i = 0;
        ch = 'B';
        result = false;
        obj = null;
        str = "Bye";
        bytes[1] = 0;*/

        /*char symbol = 'a';
        System.out.println(symbol);
        symbol = '\u003A';
        System.out.println(symbol);
        symbol = '\'';
        System.out.println(symbol);
        symbol = '\\';
        System.out.println(symbol);*/

        /*String quotation = "\"Hello, Jude\", he said.";
        System.out.println(quotation);
        String path = "C:\\Windows\\ Notepad.exe";
        System.out.println(path);*/

        /*byte asd = 97;
        byte asd1 = -115;
        short asd2 = -10000;
        int asd3 = 52130;
        long asd4 = 4825932;
        int asd5 = 0x256;
        boolean isMale = true;*/

        /*String greeting = "Hello";
        String greetingB = "World";
        Object helloWorld;
        helloWorld = greeting + " " + greetingB;
        System.out.println(helloWorld);

        String newTask;
        newTask = "The \"use\" of quotations causes difficulties.";
        System.out.println(newTask

        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");)

        System.out.println("   o     o   ");
        System.out.println("  ooo   ooo  ");
        System.out.println(" ooooooooooo  ");
        System.out.println("  ooooooooo   ");
        System.out.println("   ooooooo    ");
        System.out.println("    ooooo     ");
        System.out.println("     ooo      ");
        System.out.println("      o");*/

        /*String firstName;
        String lastName;
        int age;
        char genderMale = 'M';
        char genderFemale = 'F';
        int idNumber;*/

        /*int a;
        int b;
        a = 5;
        b = 10;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        int z = 4 + 8;
        System.out.println(z);

        String firstName = "Doncho";
        String lastName = "Gluharov";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);*/

        /*int squareRerimeter = 17;
        double squareSide = squareRerimeter / 4.0;
        double squareArea = squareSide * squareSide;
        System.out.println(squareSide);
        System.out.println(squareArea);*/

        /*int a = 5;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a + b++);
        System.out.println(a + b);
        System.out.println(a + (++b));
        System.out.println(a + b);
        System.out.println(14 / a);
        System.out.println(14 % a);*/

        /*boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!b);
        System.out.println(b || true);
        System.out.println((5 > 7) ^ (a==b));*/

        /*String first = "Star";
        String second = "Craft";
        System.out.println(first + second);
        String output = first + second + " ";
        int number = 2;
        System.out.println( output + number)*/

        /*short a = 3;
        short b = 5;
        System.out.println( a | b );
        System.out.println( a & b );
        System.out.println( a ^ b );
        System.out.println(~a & b );
        System.out.println(a << 1 );
        System.out.println(a << 2 );
        System.out.println(a >> 1 );*/

        /*int x = 10, y = 5;
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));*/




    }

}