package com.musala.javacourse181112.tasks.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * * Populate an instance per general-purpose collection implementations
 * ** Set (HashSet, TreeSet, LinkedHashSet)
 * ** List (ArrayList, LinkedList)
 * ** Queue
 * ** Deque (ArrayDeque, LinkedList)
 * * Populate a Map
 * * Loop a collection/map and modify (remove an element/entry while looping)
 * * Apply add/put remove contains size isEmpty etc.
 */
public class CollectionImplementations {
    public static void main(final String[] args) {
//        hashSetImplementation();
//        System.out.println();
        treeSetImplementation();
//        System.out.println();
//        arrayList();
//        System.out.println();
//        linkedHashSetImplementation();
//        arrayList();
    }

    public static void hashSetImplementation() {
        final Set<Integer> integerHashSet = IntStream
                .range(0, 3)
                .boxed()
                .map(i -> i + 1)
                // Supplier<R> supplier <- supplier of collection (implementation-specific) instance
                // BiConsumer<R, ? super T> accumulator <- what happens if accumulate one value to set
                // BiConsumer<R, R> combiner <- what happens if combine two sets of values
                .collect(HashSet::new, HashSet::add, AbstractCollection::addAll);

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
        final Set<Integer> integerTreeSet = IntStream
                .range(0, 7)
                .boxed()
                .map(i -> i + 1)
                .collect(TreeSet::new, TreeSet::add, AbstractCollection::addAll);

        integerTreeSet.add(14);
        integerTreeSet.add(10);
        integerTreeSet.add(56);
        integerTreeSet.add(9);

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
        Scanner scanner = new Scanner(System.in);
        final LinkedHashSet<String> linkedHashSet = new LinkedHashSet(8);
        for (int i = 0; i < linkedHashSet.size(); i++) {
            linkedHashSet.add(scanner.next());
            linkedHashSet.stream()
                    .map(element -> scanner.next())
                    .collect(Collectors.toSet());
//        linkedHashSet.add(scanner.next())
//        linkedHashSet.add("know");
//        linkedHashSet.add("how");
//        linkedHashSet.add("to");
//        linkedHashSet.add("populate");
//        linkedHashSet.add("using");
//        linkedHashSet.add("the");
//        linkedHashSet.add("keyboardInput");

//        System.out.println("Printing LinkedHashSet... " + linkedHashSet);
//        System.out.println("LinkedHashSet size is " + linkedHashSet.size());
//        Iterator iterator = linkedHashSet.iterator();
//            System.out.println("Remove elements " + linkedHashSet.remove("to"));


        }
    }


    public static void arrayList() {
        final List<Integer> integerList = new ArrayList<>(105);
        IntStream.range(0, 100).forEach(i -> integerList.add(null));
//            integerList.add(50,100);
        System.out.println(integerList.size());
        System.out.println(integerList);
    }
}