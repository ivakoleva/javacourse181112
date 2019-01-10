package com.musala.javacourse181112.tasks.innerexercise;

public class LocalClassExercise {
    public static void main(String[] args) {


        class LocalClass{
            private  String string="Im a local class";

            public String getString() {
                return string;
            }
        }
        final LocalClass localClass=new LocalClass();

        System.out.println(localClass.getString());
    }
}
