package com.musala.javacourse181112.tasks.collections;

//    ** Populate an instance per general-purpose collection implementations
//            *** Set (HashSet, TreeSet, LinkedHashSet)
//            *** List (ArrayList, LinkedList)
//            *** Queue
//            *** Deque (ArrayDeque, LinkedList)
//    ** Populate a Map
//    ** Loop a collection/map and modify (remove an element/entry while looping)
//    ** Apply add/put remove contains size isEmpty etc.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionImplementations {
    public static void main(final String[] args) {
        hashSetImplementation();
        System.out.println();
        treeSetImplementation();
    }

    public static void hashSetImplementation() {
        final Set<Integer> integerHashSet = new HashSet<>(IntStream
                .range(0, 3)
                .boxed()
                .map(i -> i + 1)
                .collect(Collectors.toSet()));

        System.out.println("Printing integerHashSet: " + integerHashSet);
        System.out.println("it has " + integerHashSet.size() + " elements.");
        integerHashSet.remove(2);
        System.out.print("element 2 was removed.. new integerHasSet looks like this: ");

        final Iterator iterator = integerHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        integerHashSet.clear();
        System.out.println("\nDeleting all elements.. " + integerHashSet);
        System.out.println("Is the hashSet empty? " + integerHashSet.isEmpty());
    }

    public static void treeSetImplementation() {
        final Set<Integer> integerTreeSet = new TreeSet<>(IntStream
                .range(0, 7)
                .boxed()
                .map(i -> i + 1)
                .collect(Collectors.toSet()));
        integerTreeSet.add(14);

        System.out.println("Printing integerTreeSet: " + integerTreeSet);
        System.out.println("It has " + integerTreeSet.size() + " elements.");
        integerTreeSet.remove(1);
        integerTreeSet.remove(5);
        System.out.print("Elements 1 and 5 were removed.. new integerTreeSet looks like this: ");
        final Iterator iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nFirst element is: " + ((TreeSet<Integer>) integerTreeSet).first());
        System.out.println("First element is pooled.. " + ((TreeSet<Integer>) integerTreeSet).pollFirst());
        System.out.println("Now it looks this way: " + integerTreeSet);

        integerTreeSet.clear();

        System.out.println("Deleting all elements.. " + integerTreeSet);
        System.out.println("Is the treeSet empty? " + integerTreeSet.isEmpty());
    }

    public static void linkedHashSetImplementation() {
        final Set<Integer> integerTreeSet = new TreeSet<>(IntStream
                .range(0, 7)
                .boxed()
                .map(i -> i + 1)
                .collect(Collectors.toSet()));

        System.out.println("Printing integerTreeSet: " + integerTreeSet);
        System.out.println("It has " + integerTreeSet.size() + " elements.");
        integerTreeSet.remove(1);
        integerTreeSet.remove(5);
        System.out.print("Elements 1 and 5 were removed.. new integerTreeSet looks like this: ");

        final Iterator iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        integerTreeSet.clear();
        System.out.println("\nDeleting all elements.. " + integerTreeSet);
        System.out.println("Is the treeSet empty? " + integerTreeSet.isEmpty());
    }


}
