package com.musala.javacourse181112.MyStuff.CollectionsExercise;

import java.util.*;

public class CollectionsExercise {

    public static void main(String[] args) {
        Collection<String> pets = new HashSet<>();
        pets.add("Cat");
        pets.add("Dog");
        pets.add("Fish");

        Collection<String> food = new TreeSet<>();
        food.add("Pizza");
        food.add("Ice Cream");
        food.add("Cookies");

        Collection<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<String> morePets = new ArrayList<String>(pets);
        morePets.add("parrot");
        morePets.add("spider");
        morePets.add("hamster");

        Queue<String> queue = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        queue.add("Wake up");
        queue.add("Eat");
        queue.add("Sleep");

        Deque<Integer> integers = new ArrayDeque<>();
        integers.add(1);
        integers.add(6);
        integers.add(8);

        hashSetStuff(pets);
        treeSetStuff(food);
        linkedHashSet(numbers);
        arrayListStuff(morePets);
        queueStuff(queue);
        arrayDequeueStuff(integers);


    }
    public static void hashSetStuff(Collection <String> pets) {
        Map map = new HashMap();
        map.put("cat","Cats.");
        map.put("fish","fish");

        System.out.println(pets);
        System.out.println(pets .size());

        pets.remove("Dog");
        System.out.println(pets);

        Scanner scanner = new Scanner(System.in);
        int i;
        for(i = pets.size(); i<5 ; i++)
        {
            pets.add(scanner.nextLine());
            System.out.println(pets);
        }
        pets.clear();

        Object cat = map.get("cat");



        System.out.println(pets);

        System.out.println("I love " + cat);
    }
    public static void treeSetStuff(Collection <String> food){
        System.out.println(food);
    }
    public static void linkedHashSet(Collection<Integer> numbers){
        System.out.println(numbers);
    }
    public static void arrayListStuff(Collection <String> morePets){
        System.out.println(morePets);
    }
    public  static void queueStuff(Collection<String> queue){
        System.out.println(queue);
    }
    public  static void arrayDequeueStuff(Collection<Integer> integers){
        System.out.println(integers);
    }
}

