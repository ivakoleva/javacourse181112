package com.musala.javacourse181112.tasks.collections;

import java.util.*;

// ok
public class HomeworkCollections {
    public static void main(final String[] args) {
        executeWithHashSet();
        executeWithTreeSet();
        executeWithLinkedHashSet();
        executeWithArrayList();
        executeWithPriorityQueue();
        executeWithHashMap();
    }

    public static void executeWithHashSet() {
        final Set<String> stringSet = new HashSet<>();
        stringSet.add("One");
        stringSet.add("Two");
        stringSet.add("Three");
        stringSet.add("Four");
        final Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void executeWithTreeSet() {
        final Set<String> stringSet = new TreeSet<>();
        stringSet.add("Andrey");
        stringSet.add("Mario");
        stringSet.add("Ivan");
        stringSet.add("Georgi");
        //Traversing elements
        final Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void executeWithLinkedHashSet() {
        final Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("One");
        stringSet.add("Two");
        stringSet.add("Three");
        stringSet.add("Four");
        stringSet.add("Five");
        final Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void executeWithArrayList() {
        final List<String> stringList = new ArrayList<>();
        stringList.add("Milen");
        stringList.add("Marin");
        stringList.add("Rafail");
        stringList.add("Genadi");
        System.out.println(stringList);
    }

    public static void executeWithLinkedList() {
        final List<String> stringList = new LinkedList<>();
        stringList.add("Andrei");
        stringList.add("Zahari");
        stringList.add("Evlogi");
        stringList.add("Mitko");

        final Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void executeWithPriorityQueue() {
        final Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("Ivan");
        stringQueue.add("Joro");
        stringQueue.add("Gosho");
        stringQueue.add("Valeri");
        stringQueue.add("Milen");
        System.out.println("head:" + stringQueue.element());
        System.out.println("head:" + stringQueue.poll());
        System.out.println("iterating the queue elements:");
        // TODO: generics
        final Iterator iterator = stringQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // TODO: maybe output values
        stringQueue.remove();
        stringQueue.poll();

        System.out.println("after removing two elements:");
        // TODO: maybe extract in a separate method
        final Iterator<String> iterator1 = stringQueue.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

    public static void executeWithArrayDeque() {
        final Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("One");
        stringDeque.add("Anelia");
        stringDeque.add("Kamila");

        // TODO: generics
        final Iterator iterator = stringDeque.iterator();
        while (iterator.hasNext()) {
            final String value = (String) iterator.next(); // TODO: usage
        }
    }

    public static void executeWithHashMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("RC", "T1");
        map.put("ACasas", "T1");

        final Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "" + entry.getValue());
        }

        final Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().getValue().length() % 2 == 0) {
                iterator1.remove();
            }
        }
    }
}

// explanation of anonymous class implementation above
/*class CustomHashMap extends HashMap<String, String> {
    {
        put("RC", "T1");
        put("ACasas", "T1");
    }
}*/




