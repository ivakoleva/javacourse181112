package com.musala.javacourse181112.tasks.innerexercise;

public class NonStaticInnerClass {
    private static final String TEXT = "Aloha";
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void display() {
        System.out.println("NonStaticInnerClass display()");
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
            NonStaticInnerClass.this.display();
        }

        void printNumber(final int number) {
            System.out.println("number: " + number);
            System.out.println("InnerClass number: " + this.getNumber());
            System.out.println("NonStaticInnerClass number: " + NonStaticInnerClass.this.getNumber());
        }

        void printText() {
            System.out.println(NonStaticInnerClass.TEXT);
        }
    }
}

class EntryPoint {
    public static void main(String[] args) {
        final NonStaticInnerClass.InnerClass innerClass = new NonStaticInnerClass().new InnerClass();
        innerClass.display();
        innerClass.setNumber(20);
        innerClass.printNumber(30);
        innerClass.printText();

        final NonStaticInnerClass nonStaticInnerClass = new NonStaticInnerClass();
        nonStaticInnerClass.setNumber(10);

        final NonStaticInnerClass.InnerClass innerClass1 = nonStaticInnerClass.new InnerClass();
        innerClass1.setNumber(1);
        innerClass1.printNumber(2);
    }
}