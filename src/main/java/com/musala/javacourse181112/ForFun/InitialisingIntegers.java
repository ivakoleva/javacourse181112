package com.musala.javacourse181112.ForFun;


import java.util.*;

public class InitialisingIntegers {
    private static Map<Integer,Character> MappingTool = new HashMap<>();
    public static void main(String[] args) {
        Queue<Integer> intQue = new LinkedList(Arrays.asList(theList));

        System.out.println(intQue);
        System.out.println(MappingTool);

    }
    private static Integer[] theList;

    static {
        theList = new Integer[4094];
        for (int i = 1; i < 4094; i++) {
            theList[i-1] = i;
            MappingTool.put(i, (char)i);
        }
    }
}
