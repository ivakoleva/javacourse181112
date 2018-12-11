package com.musala.javacourse181112.tasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map<Character,Integer> mapCharToInt=new HashMap<>();
        for(char c=24;c<165;c+=3){
            mapCharToInt.put(c,(int)c);
        }
        Set mapEntrySet=mapCharToInt.entrySet();
        Iterator iteratorEntrySet=mapEntrySet.iterator();
        for(;iteratorEntrySet.hasNext();){
            Map.Entry<Character,Integer> i= (Map.Entry<Character, Integer>) iteratorEntrySet.next();
            if((i.getKey()>=((int)'a')&&i.getKey()<=((int)'z'))){
                iteratorEntrySet.remove();
            }
        }
        mapCharToInt.forEach((k,v)->System.out.println(k+"->"+v));
        System.out.println();
    }
}
