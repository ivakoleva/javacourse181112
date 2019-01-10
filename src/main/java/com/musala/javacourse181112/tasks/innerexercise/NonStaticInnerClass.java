package com.musala.javacourse181112.tasks.innerexercise;

public class NonStaticInnerClass {

    private void display() {
        System.out.println("NonStaticInnerClassExample display()");
    }

    class InnerClass {

        void display() {
            System.out.println("InnerClass display()");
            NonStaticInnerClass.this.display();
        }


    }


}

class EntryPoint{
    public static void main(final String[] args) {
        final NonStaticInnerClass.InnerClass innerClass = new NonStaticInnerClass().new InnerClass();
        innerClass.display();
    }

}