package com.musala.javacourse181112.tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopsExercise {
    public static final int strLenght=5;
    public static void main(final String[] args) {
      //  final String[] arr=new String[strLenght];
final List<Integer> arrayList=new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(3);
       arrayList.forEach(i->System.out.println(i));
final Iterator<Integer> arrayIterator= arrayList.iterator();
while(arrayIterator.hasNext()){
    System.out.println(arrayIterator.next());


}


/*        int i=0;
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
}*/

 }
 public static void printArr(final String[] arr){
        for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);

        }
    }
}
