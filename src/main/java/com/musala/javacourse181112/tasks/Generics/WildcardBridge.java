package com.musala.javacourse181112.tasks.Generics;

/* * Wildcard bridge
        ** create a List of unknowns
        ** pass argument to bridge method
        ** implement workaround so we could add an object to List
        ** should be able to compile then run, and print to stdout*/

import java.util.ArrayList;
import java.util.List;

public class WildcardBridge {
    public static void main(String[] args) {
        final List<?> listOfUnknowns = new ArrayList<>();
    }
}
