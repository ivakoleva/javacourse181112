package com.musala.javacourse181112.samples2.data.structures.collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CompareElements {
   public static void main(String[] args) {
      String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
      Set set = new TreeSet();

	   for (int i = 0; i < coins.length; i++) {
		   set.add(coins[i]);
	   }
      System.out.println(Collections.min(set));
      System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

	   for (int i = 0; i <= 10; i++) {
		   System.out.print('-');
	   }
	   System.out.println();
	   System.out.println(set.size());
	   set.add("nickel");
	   System.out.println(set.size());
      System.out.println(Collections.max(set));
      System.out.println(Collections.max(set, 
      String.CASE_INSENSITIVE_ORDER));
   }
}