package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;

public class ListRotate {
   public static void main(String[] args) {
      List list = Arrays.asList("one Two three Four five six".split(" "));
      System.out.println("List :"+list);
      Collections.rotate(list, 3);
      System.out.println("rotate: " + list);
   }
}