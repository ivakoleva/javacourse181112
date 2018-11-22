package com.musala.javacourse181112.tasks;

public class LoopExersise {
    public static void main(String[] args) {
        usingWhile();
        usingDoWhile();
        usingFor();
        usingForEach();
    }

    public static void usingWhile() {
        int []ar = new int[4];
        int i=0;
        while(i< ar.length){
            ar[i]=i;
            i++;
        }
        i=0;
        while(i< ar.length){
            System.out.println(ar[i]);
            i++;
        }

    }
    public static void usingDoWhile() {
        int []ar = new int[4];
        int i=0;
        do{
            ar[i]=i;
            i++;
        }while(i< ar.length);
        i=0;
        do{
            System.out.println(ar[i]);
            i++;
        }while(i< ar.length);
    }
    public static void usingFor() {
        int []ar = new int[4];
        for(int i=0;i < ar.length;i++){
            ar[i]=i;
        }
        for(int i=0;i< ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    public static void usingForEach() {
        int []ar = new int[4];
        for(int i=0;i<ar.length;i++){
            ar[i]=i;
        }
        for(int i1:ar){
            System.out.println(i1);
        }
    }
}
