package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilExercise {
    public static void main(String[] args) {
       final List<Integer> integerList = new ArrayList<>(10);
       integerList.add(1);
       integerList.add(23);
       integerList.add(45);
       integerList.add(111);
       integerList.add(77);
       integerList.add(90);
       integerList.add(15);
       integerList.add(23);
       integerList.add(78);
       integerList.add(79);


        Iterator iter = integerList.iterator();
        while (iter.hasNext()) {

            System.out.println(iter.next());
        }



    }
}
