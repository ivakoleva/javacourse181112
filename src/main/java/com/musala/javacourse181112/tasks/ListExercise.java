package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 ** Populate an instance per general-purpose collection implementations
 *** Set (HashSet, TreeSet, LinkedHashSet)
 *** List (ArrayList, LinkedList)
 *** Queue
 *** Deque (ArrayDeque, LinkedList)
 ** Populate a Map
 ** Loop a collection/map and modify (remove an element/entry while looping)
 ** Apply add/put remove contains size isEmpty etc.
 */
public class ListExercise {
    public static void main(String[] args) {
        // arrayListExercise();
        //linkedListExercise();
        utilExercise();
    }

    public static void utilExercise() {
        List<Integer> integerList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        print(integerList);
        Collections.shuffle(integerList);
        print(integerList);
        Collections.sort(integerList);
        print(integerList);
        Collections.reverse(integerList);
        print(integerList);
        List<Integer> secondIntegerList = Collections.nCopies(100, 1);
        Stream.concat(integerList.stream(), secondIntegerList.stream()).collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));
    }
    public static void print(List<Integer> integerList){
        integerList.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
    public static void arrayListExercise() {
        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            integerArrayList.add(i);
        }
        Iterator<Integer> arrayListIterator = integerArrayList.iterator();
        for (; arrayListIterator.hasNext(); ) {
            if (arrayListIterator.next() % 2 == 0) {

            }
        }
    }

    public static void linkedListExercise() {
        List<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integerLinkedList.add(i);
        }
        Iterator<Integer> integerLinkedListIterator = integerLinkedList.iterator();
        for (; integerLinkedListIterator.hasNext(); ) {
            if (integerLinkedListIterator.next() == 7) {
                integerLinkedListIterator.remove();
            }
        }
    }
}
