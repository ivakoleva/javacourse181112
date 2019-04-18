package com.musala.javacourse181112.FirstPartJava.tasks.innerxercise;

public class StaticNestedExample {

    public static void main(String[] args) {
        StaticNestedExample staticOuter = new StaticNestedExample();
        System.out.println(StaticNested.name);
    }

    public static class StaticNested{

        static String name ;

        public StaticNested(String name2) {
            this.name2 = name2;
        }

        String name2 ;

    }
}
