package com.musala.javacourse181112;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test implements Serializable {
    public static void main(String[] args) {
        final List<String> testList=new ArrayList<>(100);
        try {
            testList.add(100, "Test100");
            System.out.println(testList.size());
        }catch (IndexOutOfBoundsException ignored){}

        
    }

}
