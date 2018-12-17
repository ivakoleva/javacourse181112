package com.musala.javacourse181112.ForFun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class linkedhashsetExercise {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final LinkedHashSet<String> hashSet = new LinkedHashSet();
        hashSet.add("know");
        hashSet.add("how");
        hashSet.add("to");
        hashSet.add("populate");
        final LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        hashSet.forEach(element -> linkedHashSet.add(getInput()));
//       for(int i = 0; i<3; i++){
//            linkedHashSet.add(getInput());
//       }
//        linkedHashSet.add("know");
//        linkedHashSet.add("how");
//        linkedHashSet.add("to");
//        linkedHashSet.add("populate");
//        linkedHashSet.add("using");
//        linkedHashSet.add("the");
//        linkedHashSet.add("keyboardInput");
//        Iterator iterator = linkedHashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println("Printing LinkedHashSet... " + linkedHashSet);
        System.out.println("LinkedHashSet size is " + linkedHashSet.size());
        //Iterator iterator = linkedHashSet.iterator();
//            System.out.println("Remove elements " + linkedHashSet.remove("to"));
    }
    public static String getInput() {
        return scanner.next();
    }
}

