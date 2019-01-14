package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;
import java.io.*;

public class ArrayToCollection{
   public static void main(String args[]) throws IOException {
      BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("How many elements you want to add to the array: ");
      int n = Integer.parseInt(in.readLine());
      String[] name = new String[n];
      
      for(int i = 0; i < n; i++) {
         name[i] = in.readLine();
      }
      List<String> list = Arrays.asList(name); 
      System.out.println();
      
      for(String li: list) {
         String str = li;
         System.out.print(str + " ");
      }
   }
}
