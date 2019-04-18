package com.musala.javacourse181112.FirstPartJava.tasks;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionsExercise {
    final static Predicate<Integer> equalsTo64 = (p) -> (p == 64);

    public static void main(String[] args) {
        arrayListExample();
        linkedListExample();
        arrayDequeExample();
        mapExample();
    }

    private static void mapExample() {
        final Map<String, String> mapSS = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toMap(
                        i -> "key" + i,
                        i -> "value" + i
                ));

        String i = "";
        Iterator<Map.Entry<String, String>> it = mapSS.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();
            System.out.println(pair.getKey() + pair.getValue());
            if (pair.getKey().contains("2")){
                it.remove();
            }
        }
    }

    private static void arrayDequeExample() {
        System.out.println("\nArrayDeque");
        final Deque<Integer> arrDeque = new ArrayDeque<Integer>(IntStream.range(0, 10).boxed()
                .map(i -> i * i).collect(Collectors.toCollection(ArrayDeque::new)));
        arrDeque.forEach(System.out::println);
        dequeMethods(arrDeque);
        useOfIterator(arrDeque.iterator());
    }

    private static void linkedListExample() {
        System.out.println("\nlinkedListExample");
        final LinkedList<Integer> linkedList = new LinkedList<>(IntStream.range(0, 10).boxed()
                .map(i -> i * i).collect(Collectors.toList()));

        listMethods(linkedList);
        dequeMethods(linkedList);
        useOfIterator(linkedList.iterator());
    }

    private static void arrayListExample() {
        System.out.println("\narrayListExample");
        final List<Integer> arrayListInteger = new ArrayList<>(IntStream.range(0, 10).boxed()
                .map(i -> i * i).collect(Collectors.toList()));

        listMethods(arrayListInteger);
        useOfIterator(arrayListInteger.iterator());
    }

    private static void dequeMethods(Deque<Integer> deque) {
        System.out.println("[after peek (get 1st)]: "+ deque.peek());
        System.out.println("[after poll (and delete it)]: "+ deque.poll());
        System.out.println("[after peek Last(get last)]: "+ deque.peekLast());
        System.out.println("[after poll Last(and delete it)]: "+ deque.pollLast());
        deque.removeFirst();
        deque.addFirst(1);
        deque.removeLast();
        deque.addLast(111);
        deque.push(2);
    }



    private static void listMethods(List<Integer> list) {
        list.forEach(System.out::println);
        System.out.println("is empty: "+ list.isEmpty());
        System.out.println(".size() " + list.size());
        System.out.println("The element with index .get(6) is: " + list.get(6));
        System.out.println("SubList from index 3 to 7: " + list.subList(3, 7));
        System.out.println(".contains(4):"+ list.contains(4));
        list.remove(2);
        System.out.println("[after remove].contains(4):"+ list.contains(4));
        list.removeIf(equalsTo64);
        System.out.println("[after predicate].contains(64):"+ list.contains(64));
    }

    private static void useOfIterator(final Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            Integer nextNumb = iterator.next();
            if (nextNumb<5){
                System.out.println(nextNumb+ " removed");
                iterator.remove();
            }
            System.out.println("with iterator: " + nextNumb);
        }
    }
}
