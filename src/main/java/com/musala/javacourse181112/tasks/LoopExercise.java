package com.musala.javacourse181112.tasks;

public class LoopExercise {
    public static void main(String[] args) {
        withWhile();
        withDoWhile();
        withFor();
        withForEach();
    }
    public static void withWhile() {
        int []array = new int[10];
        int i=0;
        while(i< array.length
        ){
            array[i]=i;
            i++;
        }
        i=0;
        while(i< array.length){
            System.out.println(array[i]);
            i++;
        }
    }
    public static void withDoWhile() {
        int []array = new int[10];
        int i=0;
        do{
            array[i]=i;
            i++;
        }while(i< array.length);
        i=0;
        do{
            System.out.println(array[i]);
            i++;
        }while(i< array.length);
    }
    public static void withFor() {
        int []array = new int[10];
        for(int i=0;i < array.length;i++){
            array[i]=i;
        }
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void withForEach() {
        int []array = new int[10];
        int i=0;
        for(int i1:array){
            i1=i;
            i++;
        }
        for(int i1:array){
            System.out.println(i1);
        }
    }
}