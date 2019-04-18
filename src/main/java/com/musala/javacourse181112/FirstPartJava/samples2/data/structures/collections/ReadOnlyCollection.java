package com.musala.javacourse181112.FirstPartJava.samples2.data.structures.collections;

import java.util.*;

public class ReadOnlyCollection {
   public static void main(String[] argv) throws Exception {
      List stuff = Arrays.asList(new String[] { "a", "b" });
      List list = new ArrayList(stuff);
      list = Collections.unmodifiableList(list);
      try {
         list.set(0, "new value");
      } catch (UnsupportedOperationException e) {
	      System.out.println("It is not possible to add a new value.");
      }
      Set set = new HashSet(stuff);
      set = Collections.unmodifiableSet(set);
      Map map = new HashMap();
      map = Collections.unmodifiableMap(map);
      System.out.println("Collection is read-only now.");
   }
}