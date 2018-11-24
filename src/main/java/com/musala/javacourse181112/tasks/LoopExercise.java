package com.musala.javacourse181112.tasks;

public class LoopExercise {
    public static void main(String[] args) {
        WhileLoop();
        DoWhileLoop();
        ForLoop();
        ForEachLoop();

        System.exit(0);



      /*  counter = 0;
        do {
            intArray[counter] = counter * 3 + 3;
            System.out.println("Element " + counter + " : " + intArray[counter]);
            counter++;
        } while (true);*/
    }

    static void WhileLoop() {
        int[] intArray = new int[5];
        int counter = 0;
        System.out.println("This is a While Loop! => ");
        while(counter <= 4) {
            intArray[counter] = (counter * 3) + 3;
            System.out.println("Element " + counter + " : " + intArray[counter]);
            counter++;
        }
    }

    static void DoWhileLoop() {
        int[] intArray = new int[5];
        int counter = 0;
        System.out.println("This is a Do While Loop! => ");
        do {
            intArray[counter] = (counter % 2) + 1;
            System.out.println("Element " + counter + " : " + intArray[counter]);
            counter++;
        } while (counter <= 4);
    }

    static void ForLoop() {
        int[] intArray = new int[5];
        int counter = 0;
        System.out.println("This is a For Loop! => ");

        for (int i = 0; i < 5; i++) {
            intArray[counter] = (counter - 5) * 4;
            System.out.println("Element " + counter + " : " + intArray[counter]);
            counter++;
        }
    }
    static void ForEachLoop() {
        int[] intArray =  { 10, 15, 20, 25, 30};
        System.out.println("This is a For Each Loop! => ");
        for (int element : intArray) {
            System.out.println("Element: " + element);
        }

    }

}
