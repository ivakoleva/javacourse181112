package com.musala.javacourse181112.tasks.collections;
import java.sql.SQLOutput;
import java.util.*;

public class HomeworkCollections {
    public static void main(String[] args) {
        hashset();
        Treeset();
        LinkedHashSet();
        ArrayList();
        PriorityQueue();
        map();


    }
    public static void hashset() {
        HashSet<String> hset = new HashSet<>();
        hset.add("One");
        hset.add("Two");
        hset.add("Three");
        hset.add("Four");
        Iterator<String> i = hset.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void Treeset(){
        TreeSet<String> al=new TreeSet<String>();
        al.add("Andrey");
        al.add("Mario");
        al.add("Ivan");
        al.add("Georgi");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void LinkedHashSet(){
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
    public static void ArrayList(){
        ArrayList<String> arrlist=new ArrayList<String>();
        arrlist.add("Milen");
        arrlist.add("Marin");
        arrlist.add("Rafail");
        arrlist.add("Genadi");

        System.out.println(arrlist);
    }
    public static void LinkedList() {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Andrei");
        al.add("Zahari");
        al.add("Evlogi");
        al.add("Mitko");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public static void PriorityQueue(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Ivan");
        queue.add("Joro");
        queue.add("Gosho");
        queue.add("Valeri");
        queue.add("Milen");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.poll());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
    public static void arrayDeque(){
        Deque deque = new ArrayDeque();
        deque.add("One");
        deque.add("Anelia");
        deque.add("Kamila");

        Iterator iterator = deque.iterator();
        while(iterator.hasNext()){
            String stringIterator = (String) iterator.next();
        }
    }
    public static void map(){
        final Map<String, String> maping = new HashMap<String, String>() {{
            put("RC", "T1");
            put("ACasas", "T1");
        }};
        Iterator mapIterator = maping.entrySet().iterator();
        while(mapIterator.hasNext()){
            Map.Entry entry = (Map.Entry) mapIterator.next();
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
        while(mapIterator.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry) mapIterator.next();
          if (entry.getValue().length()%2==0 ){
              mapIterator.remove();
          }
        }

    }
}





