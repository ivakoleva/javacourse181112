package com.musala.javacourse181112.tasks.innerexercise;

public class MainClass implements OuterClass.NestedInterface{
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        OuterClass.NestedInterface nestedInterface = new MainClass();
        nestedClass.print();
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public void print() {
                System.out.println("This is the anonymous class.");
            }

        };

        anonymousInnerClass.print();
        outerClass.displayInnerClass();
        nestedClass.print();

    }

    @Override
    public void print() {
        System.out.println("This is the nested interface.");
    }
}
