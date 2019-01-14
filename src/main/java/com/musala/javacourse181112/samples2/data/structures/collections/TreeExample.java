package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.*;

public class TreeExample{
   public static void main(String[] args) {
      System.out.println("Tree Map Example!\n");
      TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();
      tMap.put(1, "Sunday");
      tMap.put(2, "Monday");
      tMap.put(3, "Tuesday");
      tMap.put(4, "Wednesday");
      tMap.put(5, "Thursday");
      tMap.put(6, "Friday");
      tMap.put(7, "Saturday");
      System.out.println("Keys of tree map: " + tMap.keySet());
      System.out.println("Values of tree map: " + tMap.values());
      System.out.println("Key: 5 value: " + tMap.get(5)+ "\n");
      System.out.println(
         "First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
      System.out.println(
         "Last key: " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()) + "\n");
      System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
      System.out.println("Now the tree map Keys: " + tMap.keySet());
      System.out.println("Now the tree map contain: " + tMap.values() + "\n");
      System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
      System.out.println("Now the tree map Keys: " + tMap.keySet());
      System.out.println("Now the tree map contain: " + tMap.values());
   }
}