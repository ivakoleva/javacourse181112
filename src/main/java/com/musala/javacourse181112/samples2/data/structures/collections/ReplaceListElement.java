package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;

public class ReplaceListElement {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      Collections.replaceAll(list, "one", "hundred");
      System.out.println("replaceAll: " + list);
   }
}