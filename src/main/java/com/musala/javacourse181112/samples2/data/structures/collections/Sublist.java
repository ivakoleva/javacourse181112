package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;

public class Sublist {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      
      List sublist = Arrays.asList("three Four".split(" "));
      System.out.println("SubList :"+sublist);
      System.out.println(
         "indexOfSubList: " + Collections.indexOfSubList(list, sublist));
      
      System.out.println(
         "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
   }
}