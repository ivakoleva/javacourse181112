package com.musala.javacourse181112.tasks.innerexercise;

public class StaticNested {
    public static void main(String[] args) {
        final StaticNested.StaticNestedClass staticNestedClass = new StaticNested.StaticNestedClass();
        staticNestedClass.printValues();

    }


    private static class StaticNestedClass {
        private static String staticValue = "staticValue";

        public void printValues() {
            System.out.println(StaticNestedClass.staticValue);
            System.out.println(staticValue);

        }
    }

    private interface StaticNestedInterface {

        String value = "InterfaceValue";

    }
}

