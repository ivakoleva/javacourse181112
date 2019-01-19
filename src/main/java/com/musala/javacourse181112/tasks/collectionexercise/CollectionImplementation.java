package com.musala.javacourse181112.tasks.collectionexercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionImplementation {
    final static List<String> ENTRY_ELEMENTS = IntStream.range(0, 5).boxed().map(i -> "Cat").collect(Collectors.toList());

    public static void main(final String[] args) {


        implementUsingHashSet();
        implementUsingTreeSet();
        implementUsingLinkedHashSet();
        implementUsingQue();


    }

    private static void implementUsingHashSet() {
        final Set<String> hashSet = new HashSet<>(ENTRY_ELEMENTS);
        System.out.println("HasSet Implementation");
        hashSet.add("Dog");
        hashSet.add("Platypus");
        System.out.println(hashSet);


    }

    private static void implementUsingTreeSet() {
        final Set<String> treeSet = new TreeSet<>(ENTRY_ELEMENTS);
        System.out.println("TreeSet Implementation");
        treeSet.add("Dog");
        treeSet.add("Dog");
        treeSet.add("At");
        treeSet.add("DOGSS");
        System.out.println(treeSet);
    }

    private static void implementUsingLinkedHashSet() {
        System.out.println("LinkedHashSet Implementation");
        final Set<String> linkedHashSet = new LinkedHashSet<>(ENTRY_ELEMENTS);
        linkedHashSet.add("Cow");
        System.out.println(linkedHashSet);
    }

    private static void implementUsingQue() {
        System.out.println("Que Implementation");
        final Queue<Integer> queue = new PriorityQueue<>();
        for (int i=0; i < 10; i++) {
            queue.offer(i);
        }
        Iterator<Integer> integerIterator=queue.iterator();
        System.out.println(queue);
        while (integerIterator.hasNext()){
            if (integerIterator.next()%3==0)
                integerIterator.remove();
        }
        System.out.println(queue);
    }


}
