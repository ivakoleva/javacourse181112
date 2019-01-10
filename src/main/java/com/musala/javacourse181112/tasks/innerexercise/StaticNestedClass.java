package com.musala.javacourse181112.tasks.innerexercise;

class StaticNestedClass {
    private static int number = 10;
    private String bye = "Bye Bye";

    public String getBye() {
        return bye;
    }

    static class StaticNestedClass1 {
        private static int number = 5;
        private static String bye = "bye bye";

        void print() {
            System.out.println("StaticNestedClass1 number: " + number);
            System.out.println("StaticNestedClass1 bye: " + bye);
            System.out.println("StaticNestedClass number: " + StaticNestedClass.number);
        }

        static void displaySix() {
            System.out.println(6);
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        final StaticNestedClass.StaticNestedClass1 staticNestedClass1 = new StaticNestedClass.StaticNestedClass1();
        staticNestedClass1.print();
        StaticNestedClass.StaticNestedClass1.displaySix();

        final StaticNestedClass staticNestedClass = new StaticNestedClass();
        System.out.println("StaticNestedClass bye" + staticNestedClass.getBye());
    }
}
