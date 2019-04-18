package com.musala.javacourse181112.FirstPartJava.samples2.data.structures.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceListElement {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println("List :"+list);
      Collections.replaceAll(list, "one", "hundred");
      System.out.println("replaceAll: " + list);
   }
}