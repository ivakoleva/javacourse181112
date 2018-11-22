package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class Looper {
    public static int[] numbers = new int[10];
    public static int counter = 0;
    public static void main(String[] args) {
           /* automatically (using loop), initialize an array with values
print the array to stdout
 */
    forEachLoop(); // - doesn't populate the array, not sure how to do it
    forLoop();
    doWhileLoop();
    whileLoop();
    }
    public static int[] forEachLoop(){
        for ( int num : numbers ){
            numbers[counter] = counter;
            counter++;
            System.out.println(num);

        }
        return numbers;
    }
    public static int[] forLoop(){
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            numbers[i]=i;

        }
        return numbers;
    }
    public static int[] doWhileLoop(){
        int i = 0;
        do{
            numbers[i]=i;
            System.out.println(numbers[i]);
            i++;

        }while(i<numbers.length);
        return numbers;
    }
    public static int[] whileLoop(){
        int i = 0;
        while(i<numbers.length){
            numbers[i]=i;
            System.out.println(numbers[i]);
            i++;
        }
        return numbers;
    }



}

