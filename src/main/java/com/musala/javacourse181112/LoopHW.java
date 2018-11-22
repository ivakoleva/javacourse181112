package com.musala.javacourse181112;

/*
votes v2 +

Loops exercise - for each loop type (while; do-while; for; foreach)
** automatically (using loop), initialize an array with values
* ** print the array to stdout

Votes v0.3 application
*refactor, using loops
*/

import java.util.Scanner;

public class LoopHW {
    public static void main(String[] args) {
        int n, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want your array to have?");
        n = input.nextInt();
        array=new int[n];
        System.out.println();

       //for
        inputArrayFor(array, n);
        outputArrayFor(array, n);
        System.out.println();

        //do/while
        inputArrayDo(array, n);
        outputArrayDo(array, n);
        System.out.println();

        //while
        inputArrayWhile(array,n);
        outputArrayWhile(array, n);
        System.out.println();

        //foreach
        inputArrayEach(array,n);
        outputArrayEach(array, n);

        System.exit(0);
    }
private static void inputArrayFor(int[] array, int n) {
    int i;
    System.out.println("Please enter "+ n +" elements");
    Scanner input = new Scanner(System.in);
    for (i = 0; i < n; i++) {
        array[i] = input.nextInt();
    }
}
private static void outputArrayFor(int [] array, int n){
    int i, j;
    for (i=0,j=1; i< n; i++, j++)
    {
        System.out.println("Element " +j + " : " +array[i]);
    }
}
private static void inputArrayDo(int [] array, int n) {
    int i=0;
    System.out.println("Please enter "+ n +" elements");
    Scanner input = new Scanner(System.in);
    do
    {
        array[i] = input.nextInt();
        i++;
    }while(i<n);
}
private static void outputArrayDo(int [] array, int n) {
    int i =0, j = 1;
    do
    {
        System.out.println("Element " +j + " : " +array[i]);
        i++;
        j++;
    }while(i<n);
}
private static void inputArrayWhile(int [] array, int n){
    int i=0;
    System.out.println("Please enter "+ n +" elements");
    Scanner input = new Scanner(System.in);
    while (i<n) {
        array[i] = input.nextInt();
        i++;
    }
}
private static void outputArrayWhile(int [] array, int n){
    int i = 0, j= 0;
    while (i< n)
    {
        System.out.println("Element " +j + " : " +array[i]);
        i++;
        j++;
    }
}
private static void inputArrayEach (int [] array, int n) {
    System.out.println("Please enter " + n + " elements");
    Scanner input = new Scanner(System.in);
    for (int i : array) {
        array[i] = input.nextInt();
    }
}
private static void outputArrayEach (int [] array, int n){
        int j=1;
    for(int i: array)
    {
        System.out.println("Element " +j + " : " +array[i]);
        j++;
    }
}
}
