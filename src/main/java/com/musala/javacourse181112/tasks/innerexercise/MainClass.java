package com.musala.javacourse181112.tasks.innerexercise;

public class MainClass implements OuterClass.NestedInterface{
    public static void main(String[] args) {

        class LocalClass{
            public void print(){
                System.out.println("This is the local class");
            }
        }
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        OuterClass.NestedInterface nestedInterface = new MainClass();
        LocalClass localClass = new LocalClass();

        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public void print() {
                System.out.println("This is the anonymous class.");
            }

        };

        localClass.print();
        nestedClass.print();
        anonymousInnerClass.print();
        outerClass.displayInnerClass();
        nestedClass.print();

    }

    @Override
    public void print() {
        System.out.println("This is the nested interface.");
    }


}
