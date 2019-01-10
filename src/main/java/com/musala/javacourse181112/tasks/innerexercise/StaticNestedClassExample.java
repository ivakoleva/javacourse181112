package com.musala.javacourse181112.tasks.innerexercise;

class StaticNestedClassExample {
    private static int number = 10;
    private String bye = "bye";

    String getBye() {
        return bye;
    }

    static class StaticNestedClass {
        private static int number = 5;
        private static String bye = "bye bye";

        void print() {
            System.out.println("StaticNestedClass number: " + number);
            System.out.println("StaticNestedClass bye: " + bye);
            System.out.println("StaticNestedClassExample number: " + StaticNestedClassExample.number);
        }

        static void displayFive() {
            System.out.println(5);
        }
    }
}

class MainClass {
    public static void main(final String[] args) {
        final StaticNestedClassExample.StaticNestedClass staticNestedClass = new StaticNestedClassExample.StaticNestedClass();
        staticNestedClass.print();
        StaticNestedClassExample.StaticNestedClass.displayFive();

        final StaticNestedClassExample staticNestedClassExample = new StaticNestedClassExample();
        System.out.println("StaticNestedClassExample bye: " + staticNestedClassExample.getBye());
    }
}
