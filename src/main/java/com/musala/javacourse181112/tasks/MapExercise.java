package com.musala.javacourse181112.tasks;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        System.out.println("Keys"+ map.keySet());
        System.out.println("Values:" + map.values());
        System.out.println("Keys:");
        for (Integer key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("Values:");
        for (Integer value : map.values()){
            System.out.println(value);
        }
        System.out.println(" Key and Value:");
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}




