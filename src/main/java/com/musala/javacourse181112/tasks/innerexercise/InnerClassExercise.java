package com.musala.javacourse181112.tasks.innerexercise;

public class InnerClassExercise {
    private String nonStaticValue = "I am InnerClassExercise class."; //todo put text

    public String getNonStaticValue() {
        return nonStaticValue;
    }

    public static void main(String[] args) {
        //final InnerClass innerClass = new InnerClass();

        final InnerClassExercise innerClassExercise = new InnerClassExercise();

        final InnerClassExercise.InnerClass innerClass = innerClassExercise.new InnerClass();
        innerClass.printValuesToStdout();


    }
    public class InnerClass {
        private String nonStaticValue = "I am an InnerClass class."; //todo add text

        public void printValuesToStdout()
        {
            System.out.println(nonStaticValue);
        }

    }
}
