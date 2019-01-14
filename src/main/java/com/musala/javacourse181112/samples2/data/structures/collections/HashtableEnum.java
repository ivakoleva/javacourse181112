package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEnum {
   public static void main(String[] args) {
      Hashtable ht = new Hashtable();
      ht.put("1", "One");
      ht.put("2", "Two");
      ht.put("3", "Three");
      Enumeration e = ht.elements();
      
      while(e.hasMoreElements()) {
         System.out.println(e.nextElement());
      }
   }
}