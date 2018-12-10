package com.musala.javacourse181112.tasks;

import java.util.*;

public class CollectionImplentations {
    public static void main(String[] args) {
        hashSet();
        treeSet();
        linkedHashSet();
        arrayList();
        linkedList();
        queue();
    }
    public static void hashSet(){
        HashSet<String> hashSet=new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        Iterator<String> i=hashSet.iterator();
        System.out.println("Is the hashSet empty: "+ hashSet.isEmpty());
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Is the hashSet contains five: "+ hashSet.contains("Five"));
        System.out.println("The size of the hashSet: "+ hashSet.size());
        hashSet.remove("Five");
        System.out.println("The size of the hashSet after removing five: "+ hashSet.size());
        hashSet.clear();
    }
    public static void treeSet(){
        TreeSet<String> treeSet=new TreeSet();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        Iterator<String> i=treeSet.iterator();
        System.out.println("Is the treeSet empty: "+ treeSet.isEmpty());
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Is the treeSet contains five: "+ treeSet.contains("Five"));
        System.out.println("The size of the treeSet: "+ treeSet.size());
        System.out.println("Polling the last element: "+ treeSet.pollLast());
        System.out.println("The size of the treeSet after polling the last element: "+ treeSet.size());
        treeSet.clear();

    }
    public static void linkedHashSet(){
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        Iterator<String> i=linkedHashSet.iterator();
        System.out.println("Is the linkedHashSet empty: "+ linkedHashSet.isEmpty());
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("Is the linkedHashSet contains five: "+ linkedHashSet.contains("Five"));
        System.out.println("The size of the linkedHashSet: "+ linkedHashSet.size());
        linkedHashSet.remove("Five");
        System.out.println("The size of the linkedHashSet after removing five: "+ linkedHashSet.size());
        linkedHashSet.clear();
    }
    public static void arrayList() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        System.out.print(arrayList);
        System.out.println("Is the arrayList empty: " + arrayList.isEmpty());
        System.out.println("The element with index 3 is: " + arrayList.get(3));
        System.out.println("Remove the element at index 2: ");
        arrayList.remove(2);
        System.out.println("The size is: " + arrayList.size());
        arrayList.clear();
    }

    public static void linkedList(){
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");
        System.out.print(linkedList);
        System.out.println("Is the linkedList empty: " + linkedList.isEmpty());
        System.out.println("Peek (first element): " + linkedList.peek());
        System.out.println("The element with last index  is: " + linkedList.getLast());
        System.out.println("The element with index 3 is: " + linkedList.get(3));
        System.out.println("Remove the element at index 2: ");
        linkedList.remove(2);
        System.out.println("The size is: " + linkedList.size());
        linkedList.clear();
    }
    public static void queue(){
        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        System.out.print(queue);
        System.out.println("Is the queue empty: " + queue.isEmpty());
        System.out.println("Peek (first element): " + queue.peek());
        System.out.println("The size is: " + queue.size());
        System.out.println("The poll (remove the first element and peek it): " + queue.poll());
        System.out.println("The size is: " + queue.size());
        queue.clear();
    }

}
