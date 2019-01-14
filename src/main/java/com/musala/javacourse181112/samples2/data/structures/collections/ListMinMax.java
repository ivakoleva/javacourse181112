package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;

public class ListMinMax {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println(list);
      System.out.println("max: " + Collections.max(list));
      System.out.println("min: " + Collections.min(list));
   }
}