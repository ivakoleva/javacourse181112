package com.musala.javacourse181112.tasks.CollectionExercise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionImplementation {
    final static List<String> ENTRY_ELEMENTS=IntStream.range(0,5).boxed().map(i->"Cat").collect(Collectors.toList());

    public static void main(final String[] args) {


        implementUsingHashSet();
        implementUsingTreeSet();



    }
    private static void implementUsingHashSet(){
          final Set<String> hashSet=new HashSet<>(ENTRY_ELEMENTS);
        System.out.println("HasSet Implementation");
        hashSet.add("Dog");
        hashSet.add("Platypus");
        System.out.println(hashSet);


    }
    private static void implementUsingTreeSet(){
        final Set<String> treeSet=new TreeSet<>(ENTRY_ELEMENTS);
        System.out.println("TreeSet Implementation");
        treeSet.add("Dog");
        treeSet.add("Dog");
        System.out.println(treeSet);
    }


}
