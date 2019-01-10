package com.musala.javacourse181112.tasks.innerexercise;

public class OuterClass {

    private class InnerClass{ // isn't local class the same?
        public void print(){
            System.out.println("This is the inner class.");
        }
    }

    static class NestedClass{
        public void print(){
            System.out.println("This is the static nested class");
        }
    }

    interface NestedInterface{ //implicitly static
        void print();
    }

    private enum NestedEnum{
        A,
        B
    }

    void displayInnerClass(){
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }
}
