package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildcardBridgeExercise {
    /*
     ** create a List of unknowns
     ** pass argument to bridge method
     ** implement workaround so we could add an object to List
     ** should be able to compile then run, and print to stdout
     */

    final static List<?> listOfUnknowns = new ArrayList<>();

    public static void main(final String[] args) {
        System.out.println(listOfUnknowns);
    }


    public static <T> List<T> bridge() {
        final List<T> workaroundAddingObject = new ArrayList<T>((List<? extends T>) listOfUnknowns);
        return new ArrayList<T>();
    }

}




