package com.musala.javacourse181112.tasks.innerexercise;

public class StaticNestedExercise {
    private static String staticValue = "StaticNestedExercise";

    public static void main(final String[] args) {
        final StaticNestedExercise.StaticNested staticNestedInstance =
                new StaticNestedExercise.StaticNested();
        staticNestedInstance.printValuesToStdout();
        final StaticNestedExercise.StaticNestedEnum staticNestedEnum = StaticNestedEnum.WORKS;
        System.out.println(staticNestedEnum);
    }

    private enum StaticNestedEnum {
        WORKS,
        BREAKS
    }

    private interface StaticNestedInterface {
        void printString();

    }

    private static class StaticNested implements StaticNestedInterface {
        private static String staticValue = "StaticNested";

        void printValuesToStdout() {
            System.out.println(staticValue);
            System.out.println(StaticNestedExercise.staticValue);
        }

        @Override
        public void printString() {
            System.out.println("I am a method from the StaticNestedInterface");
        }
    }

}
