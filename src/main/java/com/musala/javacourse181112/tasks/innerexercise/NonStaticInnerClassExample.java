package com.musala.javacourse181112.tasks.innerexercise;

class NonStaticInnerClassExample {

    private static final String TEXT = "Hello";
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void display() {
        System.out.println("NonStaticInnerClassExample display()");
    }

    class InnerClass {

        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        void display() {
            System.out.println("InnerClass display()");
            NonStaticInnerClassExample.this.display();
        }

        void printNumber(final int number) {
            System.out.println("number : " + number);
            System.out.println("InnerClass number : " + this.getNumber());
            System.out.println("NonStaticInnerClassExample number : " + NonStaticInnerClassExample.this.getNumber());
        }

        void printText() {
            System.out.println(NonStaticInnerClassExample.TEXT);
        }
    }
}

class EntryPoint {
    public static void main(final String[] args) {

        final NonStaticInnerClassExample.InnerClass innerClass = new NonStaticInnerClassExample().new InnerClass();
        innerClass.display();
        innerClass.setNumber(20);
        innerClass.printNumber(30);
        innerClass.printText();

        final NonStaticInnerClassExample nonStaticInnerClassExample = new NonStaticInnerClassExample();
        nonStaticInnerClassExample.setNumber(10);

        final NonStaticInnerClassExample.InnerClass innerClass1 = nonStaticInnerClassExample.new InnerClass();
        innerClass1.setNumber(1);
        innerClass1.printNumber(2);
    }
}