package com.musala.javacourse181112.tasks;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LoopsExercise {
    public static void main(String[] args) {
        final List<Integer> myList = new ArrayList<>();
        String[] Loopable = new String[10];
        for(int i = 0; i<Loopable.length; i++) {
            Loopable[i] = String.valueOf(i);
        }
        myList.add(0);
        myList.add(1);
        myList.add(2);
        Arrays.stream(Loopable).forEach(System.out::println);
        final ListIterator<Integer> listIterator = myList.listIterator();
        System.out.println("\n");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            if(listIterator.next()%2==0)
            {
                listIterator.remove();
            }
        }

    }

}
