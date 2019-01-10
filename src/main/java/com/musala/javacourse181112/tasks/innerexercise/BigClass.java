package com.musala.javacourse181112.tasks.innerexercise;

public class BigClass {
    private String value = "value";
    private static String staticValue = "StaticValue";

    public String getValue() {
        return value;
    }

    public static void main(final String[] args) {

        //Inner Classes
        final BigClass bigClass = new BigClass();
        final BigClass.InnerClass innerClass = bigClass.new InnerClass();
        innerClass.printValue();
        final BigClass.InnerClass innerClass1 = bigClass.new InnerClass();

        //Static Nested Classes
        final BigClass.StaticNestedClass staticNestedClass =
                new BigClass.StaticNestedClass();
        staticNestedClass.printValues();


        class LocalClass {

        }
        LocalClass localClass = new LocalClass();
    }

    public class InnerClass {
        private String value = "value1";

        public void printValue() {
            System.out.println(value);
        }
    }

    private static class StaticNestedClass {
        private static String staticValue = "staticValue2";

        public void printValues() {
            System.out.println(BigClass.staticValue);
            System.out.println(staticValue);

        }
    }

    private interface StaticNestedInterface {

        String value = "InterfaceValue";

    }

    enum StaticNestedEnum {
    }
}
