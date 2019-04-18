package com.musala.javacourse181112.FirstPartJava.tasks.innerxercise;

public class InnerClassExample {
    public InnerClass innerClass;

    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();
        outer.innerClass= outer.new InnerClass("pewaaew");
    }

    private String name;

    public class InnerClass implements NestedInterfaceExample.NestedInterface, NestedInterfaceExample {

        public InnerClass(String pass) {
            this.pass = pass + NestedEnumExample.NestedEnum.E;
        }

        private String pass;

        @Override
        public String doNothing() {
            return null;
        }

        @Override
        public String doSomething() {
            return null;
        }
    }
}
