package com.musala.javacourse181112.tasks.innerexercise;

public class InnerClassesExercise {

    public static void main(final String[] args) {
        final InnerClassesExercise innerClassesExercise=new InnerClassesExercise();

final InnerClassesExercise.InnerClass innerClass =innerClassesExercise.new InnerClass();
        System.out.println(innerClass.getName());

    }


    public class InnerClass{
      private String name="Im an Inner Class";

        public String getName() {
            return name;
        }
    }
}

