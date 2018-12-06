package com.musala.javacourse181112.tasks;

import java.util.Arrays;
import java.util.function.Predicate;

import static java.lang.StringBuilder.*;

public class lambdaExercise2 {
    public static void main(String[] args) {


        Predicate <String>stringForString = string ->string.length()==10;
        System.out.println(stringForString.test("ahdaiwhfyueihtu"));

    }
}
