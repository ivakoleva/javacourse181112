package com.musala.javacourse181112.tasks;
import java.util.function.Predicate;
public class lambdaExercise2 {
    public static void main(String[] args) {
        Predicate <String>stringForString = string ->string.length()==10;
        System.out.println(stringForString.test("ahdaiwhfyueihtu"));
    }
}
