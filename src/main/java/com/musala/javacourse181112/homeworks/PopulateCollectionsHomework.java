package com.musala.javacourse181112.homeworks;

import java.util.*;

public class PopulateCollectionsHomework {
    public static void main(String[] args) {

        //populate Set,List,Queue,Deque
        //HashSet
        final Set<String> stringSet = new HashSet<>();
        stringSet.add("123");
        stringSet.add("blabla");
        stringSet.add("5555");
        System.out.println("Stringset" + stringSet);
        System.out.println(stringSet.contains("123"));
        stringSet.remove("123");
        System.out.println(stringSet.size());
        System.out.println(stringSet.isEmpty());

        //TreeSet
        final Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(173);
        treeSet.add(777);
        System.out.println("TreeSet" + treeSet);

        //LinkedHashSet
        final Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("5");
        linkedHashSet.add("123ertg");
        linkedHashSet.add("5");
        System.out.println("LinkedHashSet" + linkedHashSet);

        //ArrayList
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(123);
        integerList.add(1, 17);
        integerList.add(13);
        integerList.add(13);
        System.out.println("ArrayList" + integerList);

        //LinkedList
        final List<String> stringList = new LinkedList<>();
        stringList.add("asdasd");
        stringList.add("asdasd");
        stringList.add("bla");
        System.out.println("String list: " + stringList);

        //LinkedListQueue
        final Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Ivan");
        stringQueue.add("Ivan2");
        stringQueue.add("Ivan3");
        System.out.println("StringQueue: " + stringQueue);

        //ArrayDeque
        final Deque<Integer> integerDeque = new ArrayDeque<>();

        //LinkedListDeque
        final Deque<String> stringDeque = new LinkedList<>();

        // populate a map
        //HashMap
        final Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(15, "duma1");
        integerStringMap.put(1234567, "duma2");
        integerStringMap.put(333, "duma3");
        System.out.println(integerStringMap.containsKey(15));
        System.out.println(integerStringMap.containsValue("duma3"));
        System.out.println(integerStringMap.isEmpty());
        System.out.println(integerStringMap.size());
        System.out.println(integerStringMap.remove(1234567));


        //LOOP and modify - doesnt work

        int i = 1;
        for (Map.Entry<Integer, String> entry : integerStringMap.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
//            integerStringMap.put(i,"duma");
//            i++;
        }


    }
}
