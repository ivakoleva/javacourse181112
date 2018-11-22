package com.musala.javacourse181112.tasks;

public class LoopsExercise {
    public static final int strLenght=5;
    public static void main(final String[] args) {
        final String[] arr=new String[strLenght];
        int i=0;
       //while---------------------------------
        while(i<arr.length){
            if(i%2==0){
                arr[i]="EVEN";
            }
            else {
                arr[i]="ODD";
            }
            i++;
        }
        printArr(arr);
        i=0;

    //do-while---------------------------------
        do{

        if(i%2==0){
            arr[i]="EVEN1";
        }
        else {
            arr[i]="ODD1";
        }
            i++;
        }
        while(i<arr.length);
         System.out.println();
          printArr(arr);
        //for---------------------------------
        for(i=0;i<arr.length;i++){
     if(i%2==0){
         arr[i]="EVEN2";
     }
     else {
         arr[i]="ODD2";
     }
 }
     System.out.println();
        printArr(arr);

      System.out.println();
        //for-each---------------------------------
    for(String element:arr){
    System.out.println(element);
}

 }
 public static void printArr(final String[] arr){
        for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);

        }
    }
}
