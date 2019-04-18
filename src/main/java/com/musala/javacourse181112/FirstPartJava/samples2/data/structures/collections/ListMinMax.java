package com.musala.javacourse181112.FirstPartJava.samples2.data.structures.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMinMax {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
      System.out.println(list);
      System.out.println("max: " + Collections.max(list));
      System.out.println("min: " + Collections.min(list));
   }
}