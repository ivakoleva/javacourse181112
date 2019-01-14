package com.musala.javacourse181112.samples2.sorting;

public class SelectionSort {
 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
	        for (int j = i + 1; j < arr.length; j++) {
		        if (arr[j] < arr[index]) {
			        index = j;
		        }
	        }
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {10,34,2,56,7,67,88,42};
		    for(int i:arr1){
			    System.out.print(i);
			    System.out.print(", ");
		    }
		    System.out.println();
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}