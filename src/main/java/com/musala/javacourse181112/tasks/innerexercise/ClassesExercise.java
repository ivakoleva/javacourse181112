package com.musala.javacourse181112.tasks.innerexercise;

public class ClassesExercise {

    public static void main(String[] args) {

        final ClassesExercise innerClassSample = new ClassesExercise();

        final ClassesExercise.InnerClass innerClass =
                innerClassSample.new InnerClass();
        innerClass.printValueToStdout();

        final ClassesExercise.StaticNestedClass staticNestedClass =
                new ClassesExercise.StaticNestedClass();
        staticNestedClass.printValueToStdout();

        class LocalClass implements InnerInterface{
            ClassesExercise.InnerEnum status = InnerEnum.LOCAL_CLASS;
            private String value = "asd1";

            public void printValueToStdout() {
                System.out.println(value);
            }
            public void printStatusToStdout(){
                System.out.println(status);
            }
        }

        final LocalClass localClass = new LocalClass();
        localClass.printValueToStdout();

        final Runnable anonymousRunnable = () -> System.out.println("asd");
    }
    private static class StaticNestedClass implements InnerInterface {
        ClassesExercise.InnerEnum status = InnerEnum.NESTED_CLASS;
        private static String staticValue = "Asd1";

        public void printValueToStdout() {
            System.out.println(staticValue);
        }
        public void printStatusToStdout(){
            System.out.println(status);
        }
    }

    public class InnerClass implements InnerInterface {
        ClassesExercise.InnerEnum status = InnerEnum.INNER_CLASS;
        private String value = "asd1";

        public void printValueToStdout() {
            System.out.println(value);
        }
        public void printStatusToStdout(){
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
