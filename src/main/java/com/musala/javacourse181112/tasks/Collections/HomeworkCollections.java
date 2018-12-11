package com.musala.javacourse181112.tasks.Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeworkCollections {
    public static void main(String[] args) {
        executeWithHashSet();
        executeWithTreeSet();
        executeWithLinkedHashSet();
        executeWithArrayList();
        executeWithLinkedList();
        executeWithQueue();
        executeWithDeque();
        executeWithMap();
    }

    public static void executeWithHashSet() {

        final Set<String> stringSet = new HashSet<>();
        stringSet.add("chair");
        stringSet.add("table");
        stringSet.add("desk");
        stringSet.add("monitor");
        Iterator<String> i = stringSet.iterator();
        System.out.println("Is the stringSet empty: " + stringSet.isEmpty());
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Is the stringSet contains chair: " + stringSet.contains("chair"));
        System.out.println("The size of the stringSet: " + stringSet.size());
        stringSet.remove("desk");
        System.out.println("The size of the hashSet after removing desk: " + stringSet.size());
        stringSet.clear();
    }

    public static void executeWithTreeSet() {
        final Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("chair");
        stringTreeSet.add("table");
        stringTreeSet.add("desk");
        stringTreeSet.add("monitor");
        Iterator<String> i = stringTreeSet.iterator();
        System.out.println("Is the stringTreeSet empty: " + stringTreeSet.isEmpty());
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Is the stringTreeSet contains chair: " + stringTreeSet.contains("chair"));
        System.out.println("The size of the stringTreeSet: " + stringTreeSet.size());
        stringTreeSet.remove("desk");
        System.out.println("The size of the stringTreeSet after removing desk: " + stringTreeSet.size());
        stringTreeSet.clear();
    }

    public static void executeWithLinkedHashSet() {

        final Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("chair");
        stringLinkedHashSet.add("table");
        stringLinkedHashSet.add("desk");
        stringLinkedHashSet.add("monitor");
        Iterator<String> i = stringLinkedHashSet.iterator();
        System.out.println("Is the stringLinkedHashSet empty: " + stringLinkedHashSet.isEmpty());
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Is the stringLinkedHashSet contains chair: " + stringLinkedHashSet.contains("chair"));
        System.out.println("The size of the stringLinkedHashSet: " + stringLinkedHashSet.size());
        stringLinkedHashSet.remove("desk");
        System.out.println("The size of the stringLinkedHashSet after removing desk: " + stringLinkedHashSet.size());
        stringLinkedHashSet.clear();
    }

    public static void executeWithArrayList() {
        final ArrayList<String> stringArrayList = new ArrayList();
        stringArrayList.add("chair");
        stringArrayList.add("Table");
        stringArrayList.add("Desk");
        stringArrayList.add("Monitor");
        System.out.print(stringArrayList);
        System.out.println("Is the arrayList empty: " + stringArrayList.isEmpty());
        System.out.println("The element with index 3 is: " + stringArrayList.get(3));
        System.out.println("Remove the element at index 2: ");
        stringArrayList.remove(2);
        System.out.println("The size is: " + stringArrayList.size());
        stringArrayList.clear();
    }

    public static void executeWithLinkedList() {
        final LinkedList<String> stringLinkedList = new LinkedList();
        stringLinkedList.add("Chair");
        stringLinkedList.add("Table");
        stringLinkedList.add("Desk");
        stringLinkedList.add("Monitor");
        Iterator<String> i = stringLinkedList.iterator();
        System.out.println("Is the stringLinkedList empty: " + stringLinkedList.isEmpty());
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("Is the stringLinkedList empty: " + stringLinkedList.isEmpty());
        System.out.println("Peek (first element): " + stringLinkedList.peek());
        System.out.println("The element with last index  is: " + stringLinkedList.getLast());
        System.out.println("The element with index 3 is: " + stringLinkedList.get(3));
        System.out.println("Remove the element at index 2: ");
        stringLinkedList.remove(2);
        System.out.println("The size is: " + stringLinkedList.size());
        stringLinkedList.clear();

    }

    public static void executeWithQueue() {
        final PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("chair");
        stringQueue.add("Table");
        stringQueue.add("Desk");
        stringQueue.add("Monitor");
        System.out.print(stringQueue);
        System.out.println("Is the stringQueue empty: " + stringQueue.isEmpty());
        System.out.println("The element with index 3 is: " + stringQueue.peek());
        System.out.println("Remove the element at index 2: ");
        stringQueue.remove(2);
        System.out.println("The size is: " + stringQueue.size());
        stringQueue.clear();
    }

    public static void executeWithDeque() {
        final ArrayDeque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("chair");
        stringDeque.add("Table");
        stringDeque.add("Desk");
        stringDeque.add("Monitor");
        stringDeque.forEach(i -> System.out.print(i + " "));
        System.out.println("Is the stringDeque empty: " + stringDeque.isEmpty());
        System.out.println("Peek (first element): " + stringDeque.peek());
        System.out.println("The size is: " + stringDeque.size());
        System.out.println("The poll (remove the first element and peek it): " + stringDeque.poll());
        System.out.println("The size is: " + stringDeque.size());
        stringDeque.clear();
    }

    public static void executeWithMap() {
        final Map<Integer, String> map = new HashMap();
        map.put(1, "chair");
        map.put(2, "Table");
        map.put(3, "Desk");
        map.put(4, "Monitor");
        Set set = map.entrySet();
        Iterator mapIterator = set.iterator();
        while (mapIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) mapIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        while (mapIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) mapIterator.next();
            if (((int) entry.getKey()) % 2 == 0) {
                mapIterator.remove();
            }
        }
    }
}