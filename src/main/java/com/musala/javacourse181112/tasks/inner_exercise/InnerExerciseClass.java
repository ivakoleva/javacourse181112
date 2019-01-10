package com.musala.javacourse181112.tasks.inner_exercise;


import com.musala.javacourse181112.oop.InnerClassSample;

/**
 * package task.innerexercise - define and instantiate one instance per each listed bellow; narrow scope of visibility outside outer context (minimum visibility using access modifiers)
 * ** Inner class (non-static)
 * ** Static nested
 * *** class
 * *** interface
 * *** enum
 * ** Local class
 * ** Anonymous class (using a functional interface)
 */

public class InnerExerciseClass {
    public static void main(String[] args) {
        final InnerExerciseClass innerExerciseClass = new InnerExerciseClass();
        final InnerExerciseClass.InnerClass innerClass = innerExerciseClass.new InnerClass();
        innerExerciseClass.printValueToStdout();

        final InnerExerciseClass.StaticNestedClass staticNestedClass =
                new StaticNestedClass();
        staticNestedClass.printValueToStdout();

        class LocalClass implements InnerInterface {
            InnerExerciseClass.InnerEnum status = InnerEnum.LOCAL_CLASS;
            private String value = "value";

            public void printValueToStdout() {
                System.out.println(value);
            }

            public void printStatusToStdout() {
                System.out.println(status);
            }
        }
        final LocalClass localClass = new LocalClass();
        localClass.printValueToStdout();

        final Runnable anonymousRunnable = () -> System.out.println("sdf");
    }

    private void printValueToStdout() {
    }

    private static class StaticNestedClass implements InnerInterface {
        InnerExerciseClass.InnerEnum status = InnerEnum.NESTED_CLASS;

        public void printValueToStdout() {

        }

        public void printStatusToStdout() {

        }
    }

    public class InnerClass implements InnerClassSample.InnerInterface {
        InnerExerciseClass.InnerEnum status = InnerEnum.INNER_CLASS;
        private String value = "value";

        public void printValueToStdout() {
            System.out.println(value);
        }

        public void printStatusToStdout() {
            System.out.println(status);
        }
    }

    public interface InnerInterface {
        void printValueToStdout();

        void printStatusToStdout();
    }

    public enum InnerEnum {
        INNER_CLASS,
        NESTED_CLASS,
        LOCAL_CLASS;
    }
}